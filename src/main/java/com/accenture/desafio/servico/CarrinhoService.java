package com.accenture.desafio.servico;

import com.accenture.desafio.modelo.Carrinho;
import com.accenture.desafio.modelo.Frete;
import com.accenture.desafio.predicado.CarrinhoPredicado;
import com.accenture.desafio.servico.implementacao.ICarrinho;

public class CarrinhoService implements ICarrinho {
	
	@Override
	public Frete calcularFrete(Carrinho carrinho) {
		CorreiosServico correiosServico = new CorreiosServico();
		return CarrinhoPredicado.formatoIsentoFrete().test(carrinho) ? correiosServico.custoEnvio(carrinho.getFrete())
				: carrinho.getFrete();
	}

	@Override
	public Carrinho calcularValorFinalCompra(Carrinho carrinho) {
		carrinho.getProdutos().forEach(p -> {
			carrinho.setValor(carrinho.getValor() + (p.getValor() + p.getValorImposto() - p.getValorDesconto()));
		});
		return carrinho;
	}

}
