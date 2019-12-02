package com.accenture.desafio.servico;

import java.util.List;

import com.accenture.desafio.modelo.Produto;

public interface IDesconto {
	List<Produto> calcularDesconto(List<Produto> produtos);
}
