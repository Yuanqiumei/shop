package com.shopping.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@MapperScan("com.shopping.website.dao")
@SpringBootApplication
public class ShoppingWebsiteApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShoppingWebsiteApplication.class, args);
	}
}