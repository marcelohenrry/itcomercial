package com.accenture.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.desafio.modelo.Cliente;

@SpringBootApplication
public class DesafioItauApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioItauApplication.class, args);

		Cliente cliente = new Cliente.ClienteBuilder().nome("Marcelo").build();

		System.out.println(cliente);

	}

}
