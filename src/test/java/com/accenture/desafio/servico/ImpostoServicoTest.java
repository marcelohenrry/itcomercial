package com.accenture.desafio.servico;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.accenture.desafio.modelo.CategoriaEnum;
import com.accenture.desafio.modelo.Produto;
import com.accenture.desafio.servico.implementacao.ImpostoServico;

class ImpostoServicoTest {
	private ImpostoServico impostoServico = new ImpostoServico();
	@Test
	void testCalcularImposto() {
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produto = new Produto.ProdutoBuilder()
				.descricao("Trançado do Rei Careca")
				.cupom("DESIT")
				.promocao(true)
				.categoriaEnum(CategoriaEnum.E_READER)
				.valor(20)
				.build();
		produtos.add(produto);

		Produto produto2 = new Produto.ProdutoBuilder()
				.descricao("Poeira em auto mar")
				.valor(20)
				.build();
		produtos.add(produto2);
		
		produtos = impostoServico.calcularImposto(produtos);
		
		assertEquals(produtos.get(0).getValorImposto(), 0.0);
		assertEquals(produtos.get(1).getValorImposto(), 0.6);
	}

}
