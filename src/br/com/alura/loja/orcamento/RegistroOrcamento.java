package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.exception.DomainException;

public class RegistroOrcamento {
	
	public void registrar(Orcamento orcamento) {
		
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento precisa estar finalizado para registrar o orçamento na API externa");
		}
		
		
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeItens()
			);
		
		JavaHttpClient javaHttpClient = new JavaHttpClient();
		javaHttpClient.post(url, dados);
	}
	
}
