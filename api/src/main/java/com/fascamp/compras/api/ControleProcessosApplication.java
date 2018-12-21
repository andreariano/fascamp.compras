package com.fascamp.compras.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( {"com.fascamp.compras.api", "com.fascamp.compras.service", "com.fascamp.compras.repository"} )
public class ControleProcessosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleProcessosApplication.class, args);
	}
}
