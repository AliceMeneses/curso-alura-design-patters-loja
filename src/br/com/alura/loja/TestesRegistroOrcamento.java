package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroOrcamento;

public class TestesRegistroOrcamento {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("6000"), 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroOrcamento registroOrcamento = new RegistroOrcamento();
		registroOrcamento.registrar(orcamento);
	}

}
