package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
