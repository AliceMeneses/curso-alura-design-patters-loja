package br.com.alura.loja.acao;

import br.com.alura.loja.pedido.Pedido;

public class PedidoRepository {
	
	public void executar(Pedido pedido) {
		System.out.println("Salvar pedido no banco de dados");
	}

}
