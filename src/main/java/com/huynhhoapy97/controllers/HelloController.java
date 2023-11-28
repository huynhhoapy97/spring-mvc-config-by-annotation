package com.huynhhoapy97.controllers;

import com.huynhhoapy97.beans.BeanConfig;
import com.huynhhoapy97.models.Brand;
import com.huynhhoapy97.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    // Dependency injection bean marked by annotation @Component, @Repository, @Service, @Controller
    @Autowired
    Brand brand;

    // Autowired dựa vào kiểu dữ liệu với phương thức trả về Bean trong BeanConfig
    @Autowired
    Product product;

    @GetMapping("/hello")
    public String hello() {
        // Get bean marked by annotation @Configuration - @Bean
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        //Product product = (Product) context.getBean("createProduct");

        System.out.println(product);
        System.out.println(brand);

        return "hello";
    }
}
