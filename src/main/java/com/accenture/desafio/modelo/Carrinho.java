package com.accenture.desafio.modelo;

import java.util.List;

public class Carrinho {
	private double valor;
	
	private Cliente cliente;
	private List<Produto> produtos;
	
	public static class CarrinhoBuilder {
		private double valor;
		
		private Cliente cliente;
		private List<Produto> produtos;
		
		public CarrinhoBuilder() {
			
		}
		
		public CarrinhoBuilder valor(double valor) {
			this.valor = valor;
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
}
