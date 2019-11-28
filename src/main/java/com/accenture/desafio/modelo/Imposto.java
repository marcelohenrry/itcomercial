package com.accenture.desafio.modelo;

public class Imposto {
	private int valor;

	public static class ImpostoBuilder {
		private int valor;

		public ImpostoBuilder valor(int valor) {
			this.valor = valor;
			return this;
		}

		public Imposto build() {
			return new Imposto(this);
		}

	}

	private Imposto(ImpostoBuilder builder) {
		valor = builder.valor;

	}

	public int getValor() {
		return valor;
	}
}
