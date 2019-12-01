package com.accenture.desafio.modelo;

import java.util.List;

public class Carrinho {
	private double valor;
	private boolean midiaDigital;
	private Cliente cliente;
	private List<Produto> produtos;
	private Frete frete;

	public static class CarrinhoBuilder {
		private double valor;
		private boolean midiaDigital;
		private Cliente cliente;
		private List<Produto> produtos;
		private Frete frete;

		public CarrinhoBuilder() {

		}

		public CarrinhoBuilder valor(double valor) {
			this.valor = valor;
			return this;
		}

		public CarrinhoBuilder midiaDigital(boolean midiaDigital) {
			this.midiaDigital = midiaDigital;
			return this;
		}

		public CarrinhoBuilder cliente(Cliente cliente) {
			this.cliente = cliente;
			return this;
		}

		public CarrinhoBuilder produtos(List<Produto> produtos) {
			this.produtos = produtos;
			return this;
		}

		public CarrinhoBuilder frete(Frete frete) {
			this.frete = frete;
			return this;
		}

		public Carrinho build() {
			return new Carrinho(this);
		}
	}

	private Carrinho(CarrinhoBuilder builder) {
		valor = builder.valor;
		midiaDigital = builder.midiaDigital;
		cliente = builder.cliente;
		produtos = builder.produtos;
		frete = builder.frete;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Frete getFrete() {
		return frete;
	}

	public boolean isMidiaDigital() {
		return midiaDigital;
	}

	@Override
	public String toString() {
		return "Carrinho [valor=" + valor + ", midiaDigital=" + midiaDigital + ", cliente=" + cliente + ", produtos="
				+ produtos + ", frete=" + frete + "]";
	}
	
	
}
