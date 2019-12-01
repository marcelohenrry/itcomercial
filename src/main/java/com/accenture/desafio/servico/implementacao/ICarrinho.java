package com.accenture.desafio.servico.implementacao;

import com.accenture.desafio.modelo.Carrinho;
import com.accenture.desafio.modelo.Frete;

public interface ICarrinho {
	Frete calcularFrete(Carrinho carrinho);
}
