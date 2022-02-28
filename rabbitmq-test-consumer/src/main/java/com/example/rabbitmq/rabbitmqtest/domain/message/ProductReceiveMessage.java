package com.example.rabbitmq.rabbitmqtest.domain.message;

import com.example.rabbitmq.rabbitmqtest.domain.service.ProductService;
import com.example.rabbitmq.rabbitmqtest.domain.vo.ProductDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProductReceiveMessage {

  private final ProductService productService;

  public ProductReceiveMessage(ProductService productService) {
    this.productService = productService;
  }

  @RabbitListener(queues = {"${com.template.rabbitmq.queue}"})
  public void receive(@Payload ProductDTO productDTO) {
      productService.processMessageProduct(productDTO);
  }

}
