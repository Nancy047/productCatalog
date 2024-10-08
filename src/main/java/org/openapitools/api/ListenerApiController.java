package org.openapitools.api;

import org.openapitools.model.CatalogAttributeValueChangeEvent;
import org.openapitools.model.CatalogBatchEvent;
import org.openapitools.model.CatalogCreateEvent;
import org.openapitools.model.CatalogDeleteEvent;
import org.openapitools.model.CatalogStateChangeEvent;
import org.openapitools.model.CategoryAttributeValueChangeEvent;
import org.openapitools.model.CategoryCreateEvent;
import org.openapitools.model.CategoryDeleteEvent;
import org.openapitools.model.CategoryStateChangeEvent;
import org.openapitools.model.Error;
import org.openapitools.model.EventSubscription;
import org.openapitools.model.ProductOfferingAttributeValueChangeEvent;
import org.openapitools.model.ProductOfferingCreateEvent;
import org.openapitools.model.ProductOfferingDeleteEvent;
import org.openapitools.model.ProductOfferingPriceAttributeValueChangeEvent;
import org.openapitools.model.ProductOfferingPriceCreateEvent;
import org.openapitools.model.ProductOfferingPriceDeleteEvent;
import org.openapitools.model.ProductOfferingPriceStateChangeEvent;
import org.openapitools.model.ProductOfferingStateChangeEvent;
import org.openapitools.model.ProductSpecificationAttributeValueChangeEvent;
import org.openapitools.model.ProductSpecificationCreateEvent;
import org.openapitools.model.ProductSpecificationDeleteEvent;
import org.openapitools.model.ProductSpecificationStateChangeEvent;


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

public class ListenerApiController implements ListenerApi {

    private final NativeWebRequest request;

    @Autowired
    public ListenerApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
