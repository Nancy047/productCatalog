package org.openapitools.api;

import org.openapitools.utils.ProductCatalogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tmf-api/productCatalogManagement/v4")
public class ProductDetailingController {
    @Autowired
    ProductCatalogUtils productCatalogUtils;

    @GetMapping("/getOverview")
    public ResponseEntity<Object> getOverview(){
        return ResponseEntity.ok().body(productCatalogUtils.getCatalogOverview());
    }
    @GetMapping("/getDocument")
    public ResponseEntity<Object> getDocument(){
        return ResponseEntity.ok().body(productCatalogUtils.getCatalogDocument());
    }
    @GetMapping("/getSupport")
    public ResponseEntity<Object> getSupport(){
        return ResponseEntity.ok().body(productCatalogUtils.getCatalogSupport());
    }

}
