package org.openapitools.configuration;

import org.openapitools.model.IndividualStateType;
import org.openapitools.model.OrganizationStateType;
import org.openapitools.model.ProductRelationshipType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.individualStateTypeConverter")
    Converter<String, IndividualStateType> individualStateTypeConverter() {
        return new Converter<String, IndividualStateType>() {
            @Override
            public IndividualStateType convert(String source) {
                return IndividualStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.organizationStateTypeConverter")
    Converter<String, OrganizationStateType> organizationStateTypeConverter() {
        return new Converter<String, OrganizationStateType>() {
            @Override
            public OrganizationStateType convert(String source) {
                return OrganizationStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productRelationshipTypeConverter")
    Converter<String, ProductRelationshipType> productRelationshipTypeConverter() {
        return new Converter<String, ProductRelationshipType>() {
            @Override
            public ProductRelationshipType convert(String source) {
                return ProductRelationshipType.fromValue(source);
            }
        };
    }

}
