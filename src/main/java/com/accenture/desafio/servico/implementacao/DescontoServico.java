package com.accenture.desafio.servico.implementacao;

import java.util.List;

import com.accenture.desafio.modelo.Produto;
import com.accenture.desafio.predicado.ProdutoPredicado;
import com.accenture.desafio.servico.IDesconto;
import com.accenture.desafio.util.Constante;

public class DescontoServico implements IDesconto {

	@Override
	public List<Produto> calcularDesconto(List<Produto> produtos) {
		produtos.stream().filter(ProdutoPredicado.informouCupom()).filter(ProdutoPredicado.emPromocao()).forEach(p -> {
			p.setValorDesconto((Constante.DESCONTO * p.getValor()) / 100);
		});
		return produtos;
	}
}
