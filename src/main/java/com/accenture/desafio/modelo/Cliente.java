package com.accenture.desafio.modelo;

public class Cliente {
	private String nome;
	private String email;

	public static class ClienteBuilder {
		private String nome;
		private String email;

		public ClienteBuilder() {

		}

		public ClienteBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public ClienteBuilder email(String email) {
			this.email = email;
			return this;
		}

		public Cliente build() {
			return new Cliente(this);
		}
	}

	private Cliente(ClienteBuilder builder) {
		nome = builder.nome;
		email = builder.email;

	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + "]";
	}

}
