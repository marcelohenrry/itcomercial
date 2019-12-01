package com.accenture.desafio;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.desafio.modelo.Carrinho;
import com.accenture.desafio.modelo.Cliente;
import com.accenture.desafio.modelo.Frete;
import com.accenture.desafio.modelo.Produto;
import com.accenture.desafio.servico.CorreiosServico;

@SpringBootApplication
public class DesafioItauApplication {
	private static final Logger LOGGER = Logger.getLogger(DesafioItauApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(DesafioItauApplication.class, args);

		LOGGER.log(Level.INFO, "Cliente");
		Cliente cliente = new Cliente.ClienteBuilder().nome("Marcelo").build();

		Frete frete = new Frete.FreteBuilder().cepOrigem("30690-770").cepDestino("55620-000").build();

		Produto produto = new Produto.ProdutoBuilder()
				.descricao("Trança Rei Careca")
				.cupom("DESIT")
				.valor(20)
				.build();

		Carrinho carrinho = new Carrinho.CarrinhoBuilder()
				.cliente(cliente)
				.frete(frete)
				.build();

		LOGGER.log(Level.INFO, "Calculando o custo dos correios.");
		CorreiosServico correiosServico = new CorreiosServico();
		correiosServico.custoEnvio(frete);
		LOGGER.log(Level.INFO, frete.toString());
	}

}
