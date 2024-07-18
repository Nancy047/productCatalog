package org.openapitools.utils;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ProductCatalogUtils {
    @Value("${catalog.overview}")
    private String catalogOverview;

    @Value("${catalog.document}")
    private String catalogDocument;

    @Value("${catalog.support}")
    private String catalogSupport;

}
