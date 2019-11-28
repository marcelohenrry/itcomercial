package com.accenture.desafio.modelo;

public class Cupom {
	private String descricao;
	private short desconto;
	
	public static class CupomBuilder {
		private String descricao;
		private short desconto;
		
		public CupomBuilder() {
			
		}
		
		public CupomBuilder descricao(String descricao) {
			this.descricao = descricao;
			return this;
		}
		
		public CupomBuilder desconto(short desconto) {
			this.desconto = desconto;
			return this;
		}
		
		public Cupom build() {
			return new Cupom(this);
		}
		
	}
	
	private Cupom(CupomBuilder cupomBuilder) {
		descricao = cupomBuilder.descricao;
		desconto = cupomBuilder.desconto;
	}
	public short getDesconto() {
		return desconto;
	}
	public String getDescricao() {
		return descricao;
	}
	
}
