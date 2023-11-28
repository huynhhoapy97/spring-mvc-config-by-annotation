package com.huynhhoapy97.beans;

import com.huynhhoapy97.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    Product createProduct() {
        Product product = new Product();
        product.setId("3");
        product.setName("EAA");
        product.setPrice(1300000.0);

        return product;
    }
}
