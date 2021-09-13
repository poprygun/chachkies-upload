package io.microsamples.openapi.upload.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-13T17:51:26.996660-04:00[America/New_York]")

@Controller
@RequestMapping("${openapi.appAccelerator.base-path:/api/operators}")
public class ChachkiesApiController implements ChachkiesApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ChachkiesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
