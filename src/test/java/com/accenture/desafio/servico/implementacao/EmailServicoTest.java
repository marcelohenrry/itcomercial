package com.accenture.desafio.servico.implementacao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.accenture.desafio.modelo.Carrinho;
import com.accenture.desafio.modelo.Cliente;

public class EmailServicoTest {
	private EmailServico emailServico = new EmailServico();
	@Test
	public void testEnviarEmail() {
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
