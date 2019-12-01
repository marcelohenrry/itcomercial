package com.accenture.desafio.modelo;

public class Produto {
	private String descricao;
	private boolean promocao;
	private double valor;
	private double valorDesconto;
	private double valorImposto;
	private String cupom;
	
	private CategoriaEnum categoriaEnum;

	public static class ProdutoBuilder {
		private String descricao;
		private boolean promocao;
		private double valor;
		private double valorDesconto;
		private double valorImposto;
		private CategoriaEnum categoriaEnum;
		private String cupom;

		public ProdutoBuilder descricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public ProdutoBuilder promocao(boolean promocao) {
			this.promocao = promocao;
			return this;
		}

		public ProdutoBuilder valor(double valor) {
			this.valor = valor;
			return this;
		}

		public ProdutoBuilder valorDesconto(double valorDesconto) {
			this.valorDesconto = valorDesconto;
			return this;
		}

		public ProdutoBuilder valorImposto(double valorImposto) {
			this.valorImposto = valorImposto;
			return this;
		}

		public ProdutoBuilder categoriaEnum(CategoriaEnum categoriaEnum) {
			this.categoriaEnum = categoriaEnum;
			return this;
		}

		public ProdutoBuilder cupom(String cupom) {
			this.cupom = cupom;
			return this;
		}

		public Produto build() {
			return new Produto(this);
		}

	}

	private Produto(ProdutoBuilder builder) {
		descricao = builder.descricao;
		promocao = builder.promocao;
		valor = builder.valor;
		valorDesconto = builder.valorDesconto;
		valorImposto = builder.valorImposto;
		categoriaEnum = builder.categoriaEnum;
		cupom = builder.cupom;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public double getValor() {
		return valor;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public String getCupom() {
		return cupom;
	}

	public CategoriaEnum getCategoriaEnum() {
		return categoriaEnum;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", promocao=" + promocao + ", valor=" + valor + ", valorDesconto="
				+ valorDesconto + ", valorImposto=" + valorImposto + ", cupom=" + cupom + ", categoriaEnum="
				+ categoriaEnum + "]";
	}
	
	
}
