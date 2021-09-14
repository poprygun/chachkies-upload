package io.microsamples.accelerator.chachkies.storage;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public interface StorageAdapter {
    void upload(Path source, InputStream file, Map<String, String> headers);
    byte[] get(Path path);
    Map<String, String> getMetadata(Path path);
    List<String> list();
}
