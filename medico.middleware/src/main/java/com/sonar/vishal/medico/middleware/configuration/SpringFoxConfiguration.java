package com.sonar.vishal.medico.middleware.configuration;

import com.sonar.vishal.medico.middleware.constant.TagConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

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
                .apiInfo(metadata())
                .tags(new Tag(TagConstant.ERROR_TAG, TagConstant.ERROR_TAG_DESCRIPTION))
                .tags(new Tag(TagConstant.AUTHENTICATION_TAG, TagConstant.AUTHENTICATION_TAG_DESCRIPTION));
    }

    private ApiInfo metadata() {
        return new ApiInfoBuilder()
                .title(applicationTitle)
                .description("Medico Middleware Server API Documentation")
                .version(applicationVersion)
                .license(ApiInfo.DEFAULT.getLicense())
                .termsOfServiceUrl(ApiInfo.DEFAULT.getTermsOfServiceUrl())
                .build();
    }
}
