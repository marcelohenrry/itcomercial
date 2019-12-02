package com.accenture.desafio.servico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.accenture.desafio.modelo.Carrinho;
import com.accenture.desafio.modelo.Cliente;

class EmailServicoTest {
	private EmailServico emailServico = new EmailServico();

	@Test
	void testEnviarEmail() {
		Cliente cliente = new Cliente.ClienteBuilder()
				.nome("Maiculino de Andrade")
				.email("guitarrapedalgt100@gmail.com").build();
		Carrinho carrinho = new Carrinho.CarrinhoBuilder()
				.cliente(cliente)
				.build();
		String resultado = emailServico.enviarEmail(carrinho);
		assertEquals("OK", resultado);
	}

}
