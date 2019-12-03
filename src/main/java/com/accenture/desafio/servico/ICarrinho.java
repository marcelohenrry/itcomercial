package com.accenture.desafio.servico;

import com.accenture.desafio.modelo.Carrinho;
import com.accenture.desafio.modelo.Frete;

public interface ICarrinho {
	
	public Frete calcularFrete(Carrinho carrinho);
	
	public Carrinho calcularValorFinalCompra(Carrinho carrinho);
}
