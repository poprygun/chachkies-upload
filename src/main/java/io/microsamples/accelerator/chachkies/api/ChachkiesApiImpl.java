package io.microsamples.accelerator.chachkies.api;

import io.microsamples.accelerator.upload.model.Chachkie;
import org.jeasy.random.EasyRandom;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import io.microsamples.accelerator.upload.api.ChachkiesApi;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ChachkiesApiImpl implements ChachkiesApi {

    private EasyRandom easyRandom = new EasyRandom();
    @Override
    public ResponseEntity<List<Chachkie>> getChachkies() {
        return ResponseEntity.ok(easyRandom.objects(Chachkie.class, 13).collect(Collectors.toList()));
    }
}
