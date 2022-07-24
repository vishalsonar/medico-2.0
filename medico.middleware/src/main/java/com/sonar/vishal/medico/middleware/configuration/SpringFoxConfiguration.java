package com.sonar.vishal.medico.middleware.configuration;

import com.sonar.vishal.medico.middleware.constant.RequestParameterConstant;
import com.sonar.vishal.medico.middleware.constant.TagConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ParameterType;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.List;

@EnableWebMvc
@Configuration
@EnableSwagger2
public class SpringFoxConfiguration {

    @Value("${swagger.base.package:com.sonar.vishal.medico.middleware}")
    private String basePackage;

    @Value("${application.version}")
    private String applicationVersion;

    @Value("${application.title}")
    private String applicationTitle;

    @Bean
    public Docket createDocket() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .build()
                .useDefaultResponseMessages(false)
                .apiInfo(getApiInfo())
                .globalRequestParameters(RequestParameterConstant.listRequestParameter())
                .tags(TagConstant.ERROR, TagConstant.AUTHENTICATION);
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title(applicationTitle)
                .description("Medico Middleware Server API Documentation")
                .version(applicationVersion)
                .license(ApiInfo.DEFAULT.getLicense())
                .termsOfServiceUrl(ApiInfo.DEFAULT.getTermsOfServiceUrl())
                .build();
    }
}
