/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.mall.member.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {

    @Bean
    public Docket member() {
        return getDocket("会员服务", "com.mall.member");
    }

    private Docket getDocket(String groupName, String classPackage) {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                //分组名称
                .groupName(groupName)
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage(classPackage))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(security());
    }

//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//            .apiInfo(apiInfo())
//            .select()
//            //加了ApiOperation注解的类，才生成接口文档
//            .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
//            //包下的类，才生成接口文档
//            .apis(RequestHandlerSelectors.basePackage("io.renren.modules"))
//            .paths(PathSelectors.any())
//            .build()
//            .securitySchemes(security());
//    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("会员服务")
            .description("会员服务文档")
            .termsOfServiceUrl("https://www.renren.io")
            .version("1.0.0")
            .build();
    }

    private List<ApiKey> security() {
        return newArrayList(
            new ApiKey("token", "token", "header")
        );
    }

}