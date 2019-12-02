package com.accenture.desafio.servico.implementacao;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.accenture.desafio.DesafioItauApplication;
import com.accenture.desafio.modelo.Carrinho;
import com.accenture.desafio.servico.IEmail;

public class EmailServico implements IEmail {
	private static final Logger LOGGER = Logger.getLogger(DesafioItauApplication.class.getName());

	@Override
	public String enviarEmail(Carrinho carrinho) {
		LOGGER.log(Level.INFO, "Email enviado para " + carrinho.getCliente().getEmail());
		return "OK";
	}
}
