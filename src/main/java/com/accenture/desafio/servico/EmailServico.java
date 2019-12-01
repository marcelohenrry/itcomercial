package com.accenture.desafio.servico;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import com.accenture.desafio.modelo.Carrinho;
import com.accenture.desafio.servico.implementacao.IEmail;

public class EmailServico implements IEmail {
	private static final Logger LOGGER = Logger.getLogger(CorreiosServico.class.getName());
	@Override
	public void enviarEmail(Carrinho carrinho) {
		SimpleEmail email = new SimpleEmail();
		try {
			email.setHostName("smtp.gmail.com"); 
			email.addTo(carrinho.getCliente().getEmail(), "Marcelo");
			email.setFrom("guitarrapedalgt100@gmail.com", "Me"); // remetente
			email.setSubject("Mensagem de Teste"); // assunto do e-mail
			email.setMsg("Teste de Email utilizando commons-email"); // conteudo do e-mail
			email.send(); // envia o e-mail
		} catch (EmailException e) {
			LOGGER.log(Level.SEVERE, "Erro no envio do email ".concat(e.getMessage()));
		} 

	}

}
