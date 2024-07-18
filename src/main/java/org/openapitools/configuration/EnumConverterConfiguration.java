package org.openapitools.configuration;

import org.openapitools.model.JobStateType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.jobStateTypeConverter")
    Converter<String, JobStateType> jobStateTypeConverter() {
        return new Converter<String, JobStateType>() {
            @Override
            public JobStateType convert(String source) {
                return JobStateType.fromValue(source);
            }
        };
    }

}
