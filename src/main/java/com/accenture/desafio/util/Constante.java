package com.accenture.desafio.util;

import com.accenture.desafio.modelo.CategoriaEnum;

public abstract class Constante {
	public static final double DESCONTO = 2;
	public static final double IMPOSTO = 3;
	public static final CategoriaEnum[] CATEGORIA_ISENTA = { CategoriaEnum.E_READER, CategoriaEnum.JORNAL,
			CategoriaEnum.LIVRO, CategoriaEnum.REVISTA };
	
	public static double converterParaDouble(String valor) {
		String valorTemporario = valor.replace(",", ".");
		return Double.valueOf(valorTemporario);
	}
	
	public static short converterParaShort(String valor) {
		return Short.valueOf(valor);
	}
}