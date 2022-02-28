package com.example.rabbitmq.rabbitmqtest.domain.service;

import com.example.rabbitmq.rabbitmqtest.domain.vo.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {

  public void processMessageProduct(ProductDTO productDTO) {
    log.info(String.format("Recebendo novo produto para precessamento %s", productDTO.getName()));
    System.out.println(productDTO);
  }

}
