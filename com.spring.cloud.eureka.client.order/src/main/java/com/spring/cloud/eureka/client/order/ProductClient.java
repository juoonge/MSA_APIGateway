package com.spring.cloud.eureka.client.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="product-service")
public interface ProductClient {
    // product 호출하는 code -> productController로 이동해서 return값 받아옴
    @GetMapping("/product/{id}")
    String getProduct(@PathVariable("id") String id);
}
