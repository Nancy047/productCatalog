package org.openapitools.configuration;

import org.openapitools.model.OrderItemActionType;
import org.openapitools.model.ProductOrderItemStateType;
import org.openapitools.model.ProductOrderStateType;
import org.openapitools.model.ProductStatusType;
import org.openapitools.model.TaskStateType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.orderItemActionTypeConverter")
    Converter<String, OrderItemActionType> orderItemActionTypeConverter() {
        return new Converter<String, OrderItemActionType>() {
            @Override
            public OrderItemActionType convert(String source) {
                return OrderItemActionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productOrderItemStateTypeConverter")
    Converter<String, ProductOrderItemStateType> productOrderItemStateTypeConverter() {
        return new Converter<String, ProductOrderItemStateType>() {
            @Override
            public ProductOrderItemStateType convert(String source) {
                return ProductOrderItemStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productOrderStateTypeConverter")
    Converter<String, ProductOrderStateType> productOrderStateTypeConverter() {
        return new Converter<String, ProductOrderStateType>() {
            @Override
            public ProductOrderStateType convert(String source) {
                return ProductOrderStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.productStatusTypeConverter")
    Converter<String, ProductStatusType> productStatusTypeConverter() {
        return new Converter<String, ProductStatusType>() {
            @Override
            public ProductStatusType convert(String source) {
                return ProductStatusType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.taskStateTypeConverter")
    Converter<String, TaskStateType> taskStateTypeConverter() {
        return new Converter<String, TaskStateType>() {
            @Override
            public TaskStateType convert(String source) {
                return TaskStateType.fromValue(source);
            }
        };
    }

}
