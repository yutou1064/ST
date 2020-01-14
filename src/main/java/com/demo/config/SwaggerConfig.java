package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration //必须存在 spring boot底层注解，标注一个配置类
@EnableSwagger2 //启用swagger的注解
@EnableWebMvc
//必须存在 扫描API Controller包
@ComponentScan(basePackages = {"com.demo.controller"})
public class SwaggerConfig {
    @Bean
    public Docket customDocket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(ApiInfo());
    }

    private ApiInfo ApiInfo(){
       return new ApiInfoBuilder()
                .title("项目API接口")
                .description("项目API接口描述")
                .version("1.0")
                .build();
    }
}
