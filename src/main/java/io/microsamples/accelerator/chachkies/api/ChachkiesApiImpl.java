package io.microsamples.accelerator.chachkies.api;

import io.microsamples.accelerator.chachkies.storage.StorageAdapter;
import io.microsamples.accelerator.upload.model.Chachkie;
import io.microsamples.accelerator.upload.model.ResourceMeta;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.jeasy.random.EasyRandom;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import io.microsamples.accelerator.upload.api.ChachkiesApi;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class ChachkiesApiImpl implements ChachkiesApi {

    private final EasyRandom easyRandom = new EasyRandom();
    private StorageAdapter storageAdapter;

    public ChachkiesApiImpl(StorageAdapter storageAdapter) {
        this.storageAdapter = storageAdapter;
    }


    @Override
    public ResponseEntity<List<Chachkie>> getChachkies() {
        return ResponseEntity.ok(easyRandom.objects(Chachkie.class, 13).collect(Collectors.toList()));
    }

    @SneakyThrows
    @Override
    public ResponseEntity<ResourceMeta> loadChachkies(MultipartFile file) {
        Path path = Path.of(file.getOriginalFilename());
        Map<String, String> header = new HashMap<>();
        header.put("X-Incident-Id", "C918371984");

        storageAdapter.upload(path, file.getInputStream(), header);

        try (final InputStream inputStream = storageAdapter.get(path)){
           ResourceMeta meta = new ResourceMeta();
            meta.size(BigDecimal.valueOf(inputStream.readAllBytes().length));
            meta.path(path.toAbsolutePath().toString());
            return ResponseEntity.ok(meta);
        }
    }
}
