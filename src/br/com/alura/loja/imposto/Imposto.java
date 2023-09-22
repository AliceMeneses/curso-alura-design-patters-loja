package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {
	
	private Imposto proximo;
	
	public Imposto(Imposto proximo) {
		this.proximo = proximo;
	}

	public abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		
		if (proximo != null) {
			valorOutroImposto = proximo.realizarCalculo(orcamento);
		}
		
		return valorImposto.add(valorOutroImposto);
	}
	
}
