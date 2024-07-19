package org.openapitools.api;

import org.openapitools.model.CancelProductOrder;
import org.openapitools.model.CancelProductOrderCreate;
import org.openapitools.model.Error;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-09T13:05:26.782760900+05:30[GMT+05:30]", comments = "Generator version: 7.7.0")
@Controller
@CrossOrigin(origins = "*")
@RequestMapping("${openapi.productOrdering.base-path:/tmf-api/productOrderingManagement/v4}")
public class CancelProductOrderApiController implements CancelProductOrderApi {

    private final NativeWebRequest request;

    @Autowired
    public CancelProductOrderApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
