package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroOrcamento;

public class TestesRegistroOrcamento {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("6000")));
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());
		registroOrcamento.registrar(orcamento);
	}

}
