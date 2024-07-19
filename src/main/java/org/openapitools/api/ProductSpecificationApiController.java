package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.ProductSpecification;
import org.openapitools.model.ProductSpecificationCreate;
import org.openapitools.model.ProductSpecificationUpdate;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-16T16:55:02.035577+05:30[GMT+05:30]", comments = "Generator version: 7.7.0")
@Controller
@CrossOrigin(origins = "*")
@RequestMapping("${openapi.productCatalogManagement.base-path:/tmf-api/productCatalogManagement/v4}")
public class ProductSpecificationApiController implements ProductSpecificationApi {

    private final NativeWebRequest request;

    @Autowired
    public ProductSpecificationApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
