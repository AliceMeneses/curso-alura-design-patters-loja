package br.com.alura.loja.orcamento;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient {
	
	public void post(String url, Map<String, Object> dados) {
		try {
			URL urlDaApi = new URL(url);
			URLConnection connection = urlDaApi.openConnection();
			connection.connect();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao enviar requisição HTPP");
		}
	}

}
