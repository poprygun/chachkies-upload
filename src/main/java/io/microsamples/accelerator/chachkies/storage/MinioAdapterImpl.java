package io.microsamples.accelerator.chachkies.storage;

import com.google.common.collect.ImmutableList;
import io.microsamples.accelerator.chachkies.config.StorageProperties;
import io.minio.*;
import io.minio.messages.Item;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
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
    public byte[] get(Path path) {
        GetObjectArgs args = GetObjectArgs.builder()
                .bucket(storageProperties.getBucket())
                .object(path.toString())
                .build();
        final GetObjectResponse object = minioClient.getObject(args);

        return object.readAllBytes();
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

    @Override
    public List<String> list() {
        ListObjectsArgs args = ListObjectsArgs.builder()
                .bucket(storageProperties.getBucket())
                .build();
        final Iterable<Result<Item>> results = minioClient.listObjects(args);

        final ImmutableList<Result<Item>> results1 = ImmutableList.copyOf(results);
        List<String> s3Objects = new ArrayList<>();
        results1.forEach(itemResult -> {
            try {
                s3Objects.add(String.format("👀 Object Key: %s Size: %d", itemResult.get().objectName(), itemResult.get().size()));
            } catch (Exception ignored) {
            }
        });

        return s3Objects;
    }
}
