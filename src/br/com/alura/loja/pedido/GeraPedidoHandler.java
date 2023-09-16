package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {
	
	//construtor com injeção de dependencias repository, EmailService..
	
	public void executar(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		LocalDateTime data = LocalDateTime.now();
		
		Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);
		
		System.out.println("Salvar pedido no banco de dados");
		System.out.println("Enviar e-mail com dados do novo pedido no banco de dados");
	}

}
