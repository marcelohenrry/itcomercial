package com.accenture.desafio.modelo;

import java.util.StringJoiner;

public class Cliente {
	private String nome;
	
	public static class ClienteBuilder {
		private String nome;
		
		public ClienteBuilder() {
			
		}
		
		public ClienteBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Cliente build() {
			return new Cliente(this);
		}
	}
	
	private Cliente(ClienteBuilder builder) {
		nome = builder.nome;
		
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", "[", "]").add(getNome()).toString();
	}
	
	
}
