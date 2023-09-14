package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	private Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo  = proximo;
	}
	
	public Desconto getProximo() {
		return proximo;
	}
	
	public abstract BigDecimal calcular(Orcamento orcamento);

}
