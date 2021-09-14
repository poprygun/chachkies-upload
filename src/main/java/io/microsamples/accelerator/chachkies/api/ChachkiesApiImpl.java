package io.microsamples.accelerator.chachkies.api;

import io.microsamples.accelerator.chachkies.storage.StorageAdapter;
import io.microsamples.accelerator.upload.api.ChachkiesApi;
import io.microsamples.accelerator.upload.model.ResourceMeta;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@Slf4j
public class ChachkiesApiImpl implements ChachkiesApi {

    private StorageAdapter storageAdapter;

    public ChachkiesApiImpl(StorageAdapter storageAdapter) {
        this.storageAdapter = storageAdapter;
    }

    @SneakyThrows
    @Override
    public ResponseEntity<Resource> getChachkie(String path) {

        byte[] fileData = storageAdapter.get(Path.of(path));
        ByteArrayResource bar = new ByteArrayResource(fileData);

        return ResponseEntity
                .ok()
                .contentLength(fileData.length)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_PDF_VALUE)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + path + "\"")
                .body(bar);
    }

    @Override
    public ResponseEntity<List<String>> getChachkies() {
        return ResponseEntity.ok(storageAdapter.list());
    }

    @SneakyThrows
    @Override
    public ResponseEntity<ResourceMeta> loadChachkies(MultipartFile file) {
        Path path = Path.of(file.getOriginalFilename());
        Map<String, String> header = new HashMap<>();
        header.put("X-Custom-Id", UUID.randomUUID().toString());

        storageAdapter.upload(path, file.getInputStream(), header);

        byte[] uploaded = storageAdapter.get(path);

        ResourceMeta meta = new ResourceMeta();
        meta.size(BigDecimal.valueOf(uploaded.length));
        meta.path(path.toAbsolutePath().toString());
        return ResponseEntity.ok(meta);
    }
}
