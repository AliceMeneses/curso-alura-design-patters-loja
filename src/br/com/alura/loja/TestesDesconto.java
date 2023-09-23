package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDesconto {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento();
		orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		
		Orcamento orcamento2 =  new Orcamento();
		orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("6000")));
		
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		
		System.out.println(calculadoraDeDescontos.calcular(orcamento1));
		System.out.println(calculadoraDeDescontos.calcular(orcamento2));
	}
	
}
