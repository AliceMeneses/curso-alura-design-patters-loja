package br.com.alura.loja.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
	
	public void executar(Pedido pedido) {
		System.out.println("Enviar e-mail com dados do novo pedido no banco de dados");
	}

}
