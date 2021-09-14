package io.microsamples.accelerator.chachkies.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "minio")
@Data
public class StorageProperties {
    private String key;
    private String secret;
    private String url;
    private String bucket;
}
