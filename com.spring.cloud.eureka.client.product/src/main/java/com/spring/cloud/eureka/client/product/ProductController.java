package com.spring.cloud.eureka.client.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Value("${server.port}") // properties, yml의 값 가져옴
    private String serverPort;

    @GetMapping("/product")
    public String getProduct(){
        return "Product info!!! from port: "+serverPort;
    }
}
