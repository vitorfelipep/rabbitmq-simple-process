package com.example.rabbitmq.rabbitmqtest.domain.service;

import com.example.rabbitmq.rabbitmqtest.domain.message.SendMessage;
import com.example.rabbitmq.rabbitmqtest.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class ProductService {

  @Autowired
  private SendMessage sendMessage;

  public void createProduct(ProductVO productVO) {
    productVO.setCreationDate(LocalDateTime.now());
    sendMessage.sendMessage(productVO);
  }
}
