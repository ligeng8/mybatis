//package com.dt.spring.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    @Bean
//	public Docket docket() {
//		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
//				.apis(RequestHandlerSelectors.basePackage("com.dt"))// handler包
//				.apis(RequestHandlerSelectors.withMethodAnnotation(RequestMapping.class))
//				.apis(RequestHandlerSelectors.withClassAnnotation(Controller.class)).paths(PathSelectors.any()).build();
//	}
//    
//    private ApiInfo apiInfo() {
//    	return new ApiInfoBuilder().title("title")
//    	                    .description("description")
//    	                    .version("version")
//    	                    .termsOfServiceUrl("termsOfServiceUrl")
//    	                    .contact("contactName")
//    	                    .license("license")
//    	                    .licenseUrl("license")
//    	                    .build();
//    }
//    
//}
