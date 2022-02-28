package com.example.rabbitmq.rabbitmqtest;

import com.example.rabbitmq.rabbitmqtest.domain.vo.ProductType;
import com.example.rabbitmq.rabbitmqtest.domain.vo.ProductVO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
public class RabbitmqTestApplication {


	public static void main(String[] args) {
		SpringApplication.run(RabbitmqTestApplication.class, args);

		ProductVO productVO = ProductVO.builder()
				.id(1L)
				.name("Viagens e Hotelaria")
				.description("Serviço de viagens e hotéis")
				.unitPrice(BigDecimal.valueOf(100L))
				.productType(ProductType.SERVICES)
				.creationDate(LocalDateTime.now()).build();


	}

}
