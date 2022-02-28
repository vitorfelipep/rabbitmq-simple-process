package com.example.rabbitmq.rabbitmqtest.domain.message;

import com.example.rabbitmq.rabbitmqtest.domain.vo.ProductVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SendMessage {

  @Value("${com.template.rabbitmq.exchange}")
  private String exchange;

  @Value("${com.template.rabbitmq.routingKey}")
  private String routingKey;

  private final RabbitTemplate rabbitTemplate;

  public SendMessage(RabbitTemplate rabbitTemplate) {
    this.rabbitTemplate = rabbitTemplate;
  }

  public void sendMessage(ProductVO produtoVO) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    rabbitTemplate.convertAndSend(exchange, routingKey, objectMapper.writeValueAsString(produtoVO));
  }
}
