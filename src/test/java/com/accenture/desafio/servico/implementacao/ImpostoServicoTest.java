package com.accenture.desafio.servico.implementacao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.accenture.desafio.modelo.CategoriaEnum;
import com.accenture.desafio.modelo.Produto;

public class ImpostoServicoTest {
	private ImpostoServico impostoServico = new ImpostoServico();
	@Test
	public void testCalcularImposto() {
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produto = new Produto.ProdutoBuilder().descricao("Trançado do Rei Careca").cupom("DESIT").promocao(true)
				.categoriaEnum(CategoriaEnum.E_READER).valor(20).build();
		produtos.add(produto);

		Produto produto2 = new Produto.ProdutoBuilder().descricao("Poeira em auto mar").valor(20).build();
		produtos.add(produto2);

		produtos = impostoServico.calcularImposto(produtos);

		assertEquals(produtos.get(0).getValorImposto(), 0.0, 0.01);
		assertEquals(produtos.get(1).getValorImposto(), 0.6, 0.01);
	}

}
