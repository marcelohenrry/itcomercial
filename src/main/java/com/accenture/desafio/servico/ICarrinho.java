package com.accenture.desafio.servico;

import com.accenture.desafio.modelo.Carrinho;
import com.accenture.desafio.modelo.Frete;

public interface ICarrinho {
	Frete calcularFrete(Carrinho carrinho);
	
	Carrinho calcularValorFinalCompra(Carrinho carrinho);
}
