package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistroOrcamento {
	
	private HttpAdapter httpAdapter;
	
	public RegistroOrcamento(HttpAdapter httpAdapter) {
		this.httpAdapter = httpAdapter;
	}
	
	public void registrar(Orcamento orcamento) {
		
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento precisa estar finalizado para registrar o orçamento na API externa");
		}
		
		
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeItens()
			);
		
		httpAdapter.post(url, dados);
	}
	
}
