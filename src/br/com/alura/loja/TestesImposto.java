package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		
		System.out.println(calculadora.calcular(orcamento, new ICMS(null)));
		
	}
	
}
