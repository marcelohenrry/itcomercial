package com.accenture.desafio.servico.implementacao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.accenture.desafio.modelo.Frete;

public class CorreiosServicoTest {
	private CorreiosServico correiosServico = new CorreiosServico();
	@Test
	public void testCustoEnvio() {
		Frete frete = new Frete.FreteBuilder().cepOrigem("30690-770").cepDestino("55620-000").peso(0.3).build();

		frete = correiosServico.custoEnvio(frete);

		assertEquals(79.5, frete.getValor(), 0.01);
		assertEquals(13, frete.getPrazoEntrega(), 0.01);
	}

}
