package com.boot.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                //加载swagger 扫描包
                .apis(RequestHandlerSelectors.basePackage("com.boot.swagger"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("SpringBoot+ Swagger2")
                        .description("")
                        .version("2.9.2")
                        .contact(new Contact("=PNZ=BeijingL", "https://blog.csdn.net/Beijing_L", "beijingL@sohu.com"))
                        .license("API的许可信息")
                        .licenseUrl("https://blog.csdn.net/Beijing_L")
                        .build());
    }
}
