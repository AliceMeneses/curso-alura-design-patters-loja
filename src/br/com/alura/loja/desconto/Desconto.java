package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	private Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo  = proximo;
	}
	
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		if (deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}
	
	public abstract boolean deveAplicar(Orcamento orcamento);
	
	public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

}
