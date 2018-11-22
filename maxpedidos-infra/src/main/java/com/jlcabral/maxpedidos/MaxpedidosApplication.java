package com.jlcabral.maxpedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MaxpedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaxpedidosApplication.class, args);
	}
}
