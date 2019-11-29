package com.accenture.desafio.modelo;

public class Produto {
	private String descricao;
	private boolean promocao;
	private boolean midiaDigital;
	private double valor;
	
	private Cupom cupom;
	private Imposto imposto;
	
	public static class ProdutoBuilder {
		private String descricao;
		private boolean promocao;
		private boolean midiaDigital;
		private double valor;
		
		private Cupom cupom;
		private Imposto imposto;
		
		
		public ProdutoBuilder descricao(String descricao) {
			this.descricao = descricao;
			return this;
		}
		public ProdutoBuilder promocao(boolean promocao) {
			this.promocao = promocao;
			return this;
		}
		public ProdutoBuilder midiaDigital(boolean midiaDigital) {
			this.midiaDigital = midiaDigital;
			return this;
		}
		public ProdutoBuilder valor(double valor) {
			this.valor = valor;
			return this;
		}
		public ProdutoBuilder cupom(Cupom cupom) {
			this.cupom = cupom;
			return this;
		}
		public ProdutoBuilder imposto(Imposto imposto) {
			this.imposto = imposto;
			return this;
		}
		public Produto build() {
			return new Produto(this);
		}
		
	}

	private Produto(ProdutoBuilder builder) {
		descricao = builder.descricao;
		promocao = builder.promocao;
		midiaDigital = builder.midiaDigital;
		valor = builder.valor;
		cupom = builder.cupom;
		imposto = builder.imposto;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public boolean isMidiaDigital() {
		return midiaDigital;
	}

	public double getValor() {
		return valor;
	}

	public Cupom getCupom() {
		return cupom;
	}

	public Imposto getImposto() {
		return imposto;
	}
}
