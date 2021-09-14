package io.microsamples.accelerator.chachkies.storage;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.Map;

public interface StorageAdapter {
    /**
     * Upload a file to Minio
     *
     * @param source      Path with prefix to the object. Object name must be included.
     * @param file        File as an inputstream
     * @param headers     Additional headers to put on the file. The map MUST be mutable. All custom headers will start with 'x-amz-meta-' prefix when fetched with {@code getMetadata()} method.
     */
    void upload(Path source, InputStream file, Map<String, String> headers);
    InputStream get(Path path);
    Map<String, String> getMetadata(Path path);
}
