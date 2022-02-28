package com.example.rabbitmq.rabbitmqtest.domain.resource;

import com.example.rabbitmq.rabbitmqtest.domain.service.ProductService;
import com.example.rabbitmq.rabbitmqtest.domain.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products")
public class ProductController {

  @Autowired
  private ProductService productService;

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity createProduct(@RequestBody ProductVO productVO) {
    productService.createProduct(productVO);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

}
