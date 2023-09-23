package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesComposicao {
	
	public static void main(String[] args) {
		Orcamento orcamentoAntigo = new Orcamento();
		orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		orcamentoAntigo.reprovar();
		
		Orcamento orcamentoNovo = new Orcamento();
		orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("300")));
		orcamentoNovo.adicionarItem(orcamentoAntigo);

		System.out.println(orcamentoNovo.getValor());
	}

}
