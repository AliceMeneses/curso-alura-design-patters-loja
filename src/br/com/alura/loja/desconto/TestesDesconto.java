package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class TestesDesconto {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(new BigDecimal("100.0"), 6);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("6000"), 1);
		
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		
		System.out.println(calculadoraDeDescontos.calcular(orcamento1));
		System.out.println(calculadoraDeDescontos.calcular(orcamento2));
	}
	
}
