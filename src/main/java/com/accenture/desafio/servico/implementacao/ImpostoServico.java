package com.accenture.desafio.servico.implementacao;

import java.util.List;

import com.accenture.desafio.modelo.Produto;
import com.accenture.desafio.predicado.ProdutoPredicado;
import com.accenture.desafio.servico.IImposto;
import com.accenture.desafio.util.Constante;

public class ImpostoServico implements IImposto {

	@Override
	public List<Produto> calcularImposto(List<Produto> produtos) {
		produtos.stream().filter(ProdutoPredicado.isentoImposto()).forEach(p -> {
			p.setValorImposto((Constante.IMPOSTO * p.getValor()) / 100);
		});
		return produtos;
	}
}
