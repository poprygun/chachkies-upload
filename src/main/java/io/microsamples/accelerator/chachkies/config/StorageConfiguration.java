package io.microsamples.accelerator.chachkies.config;

import io.minio.MinioClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StorageProperties.class)
public class StorageConfiguration {

    @Bean
    public MinioClient generateMinioClient(StorageProperties storageProperties) {
        return MinioClient.builder()
                .endpoint(storageProperties.getUrl())
                .credentials(storageProperties.getKey(), storageProperties.getSecret())
                .build();
    }
}
