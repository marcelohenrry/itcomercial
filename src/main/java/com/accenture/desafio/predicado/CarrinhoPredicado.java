package com.accenture.desafio.predicado;

import java.util.function.Predicate;

import com.accenture.desafio.modelo.Carrinho;

public abstract class CarrinhoPredicado {
	public static Predicate<Carrinho> formatoIsentoFrete() {
		return carrinho -> !carrinho.isMidiaDigital();
	}
}
