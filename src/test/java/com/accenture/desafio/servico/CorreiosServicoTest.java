package com.accenture.desafio.servico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.accenture.desafio.modelo.Frete;

class CorreiosServicoTest {
	private CorreiosServico correiosServico = new CorreiosServico();
	@Test
	void testCustoEnvio() {
		Frete frete = new Frete.FreteBuilder().cepOrigem("30690-770").cepDestino("55620-000").build();
		
		frete = correiosServico.custoEnvio(frete);
		
		assertEquals(79.5, frete.getValor());
		assertEquals(13, frete.getPrazoEntrega());
	}

}
