package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.JsonPatch;
import org.openapitools.model.Organization;
import org.openapitools.model.OrganizationFVO;
import org.openapitools.model.OrganizationMVO;
import org.openapitools.model.PatchOrganization200Response;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
@Controller
@CrossOrigin(origins = "*")
@RequestMapping("${openapi.partyManagement.base-path:/partyManagement/v5}")
public class OrganizationApiController implements OrganizationApi {

    private final NativeWebRequest request;

    @Autowired
    public OrganizationApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
