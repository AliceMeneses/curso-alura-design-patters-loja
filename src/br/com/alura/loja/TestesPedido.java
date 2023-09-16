package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.loja.acao.EnviarEmailPedido;
import br.com.alura.loja.acao.PedidoRepository;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

public class TestesPedido {

	
	public static void main(String[] args) {
		
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(List.of(
					new PedidoRepository(),
					new EnviarEmailPedido()
				));
		
		geraPedidoHandler.executar(geraPedido);
	}
	
}
