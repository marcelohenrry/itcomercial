package com.accenture.desafio.servico;

import java.util.List;

import com.accenture.desafio.modelo.Produto;

public interface IImposto {
	List<Produto> calcularImposto(List<Produto> produtos);
}
