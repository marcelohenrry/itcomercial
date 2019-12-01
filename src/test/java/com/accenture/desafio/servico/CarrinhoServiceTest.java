package com.accenture.desafio.servico;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.accenture.desafio.modelo.Carrinho;
import com.accenture.desafio.modelo.CategoriaEnum;
import com.accenture.desafio.modelo.Frete;
import com.accenture.desafio.modelo.Produto;

class CarrinhoServiceTest {
	private DescontoServico descontoServico = new DescontoServico();
	private ImpostoServico impostoServico = new ImpostoServico();
	private CarrinhoService carrinhoService = new CarrinhoService();

	@Test
	void testCalcularFrete() {
		Frete frete = new Frete.FreteBuilder().cepOrigem("30690-770").cepDestino("55620-000").build();
		Carrinho carrinho = new Carrinho.CarrinhoBuilder()
				.frete(frete)
				.build();
		carrinhoService.calcularFrete(carrinho);
		assertEquals(79.5, carrinho.getFrete().getValor());
	}

	@Test
	void testCalcularValorFinalCompra() {
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
		
		produtos = descontoServico.calcularDesconto(produtos);
		
		produtos = impostoServico.calcularImposto(produtos);
		
		Carrinho carrinho = new Carrinho.CarrinhoBuilder()
				.produtos(produtos)
				.build();
		
		carrinho = carrinhoService.calcularValorFinalCompra(carrinho);
		
		assertEquals(40.2, carrinho.getValor());
	}

}
