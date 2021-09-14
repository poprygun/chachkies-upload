package io.microsamples.accelerator.chachkies.storage;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
@Disabled
//Integration test - Need an instance of Minio in order to execute.  Might consider minio mock at some point.
class MinioAdapterImplTest {

    @Autowired
    private StorageAdapter storageAdapter;

    @Test
    void get() {
        final byte[] bytes = storageAdapter.get(Path.of("health.pdf"));
            assertThat(bytes.length).isGreaterThan(1);
    }

    @Test
    void list() {
        storageAdapter.list().forEach(
                item -> {
                    log.info(item);
                }
        );
    }
}