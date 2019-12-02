package com.accenture.desafio.servico;

import com.accenture.desafio.modelo.Carrinho;

public interface IEmail {
	String enviarEmail(Carrinho carrinho);
}
