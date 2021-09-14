package io.microsamples.accelerator.chachkies.storage;

import io.microsamples.accelerator.chachkies.config.StorageProperties;
import io.minio.*;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.Map;

@Component
public class MinioAdapterImpl implements StorageAdapter {

    private MinioClient minioClient;
    private StorageProperties storageProperties;

    public MinioAdapterImpl(MinioClient minioClient, StorageProperties storageProperties) {
        this.minioClient = minioClient;
        this.storageProperties = storageProperties;
    }

    @SneakyThrows
    @Override
    public void upload(Path source, InputStream file, Map<String, String> headers) {
        PutObjectArgs args = PutObjectArgs.builder()
                .bucket(storageProperties.getBucket())
                .object(source.toString())
                .stream(file, file.available(), -1)
                .headers(headers)
                .build();
        minioClient.putObject(args);
    }

    @SneakyThrows
    @Override
    public InputStream get(Path path) {
        GetObjectArgs args = GetObjectArgs.builder()
                .bucket(storageProperties.getBucket())
                .object(path.toString())
                .build();
        return minioClient.getObject(args);
    }

    @SneakyThrows
    @Override
    public Map<String, String> getMetadata(Path path){
        StatObjectArgs args = StatObjectArgs.builder()
                .bucket(storageProperties.getBucket())
                .object(path.toString())
                .build();
        final StatObjectResponse statObjectResponse = minioClient.statObject(args);
        return statObjectResponse.userMetadata();
    }
}
