package com.accenture.desafio.predicado;

import java.util.Arrays;
import java.util.function.Predicate;

import com.accenture.desafio.modelo.Produto;
import com.accenture.desafio.util.Constante;

public abstract class ProdutoPredicado {
	
	public static Predicate<Produto> emPromocao() {
		return produto -> produto.isPromocao();
	}
	
	public static Predicate<Produto> informouCupom() {
		return produto -> produto.getCupom() != null;
	}
	
	public static Predicate<Produto> isentoImposto() {
		return produto -> !Arrays.asList(Constante.CATEGORIA_ISENTA).contains(produto.getCategoriaEnum());
	}
}
