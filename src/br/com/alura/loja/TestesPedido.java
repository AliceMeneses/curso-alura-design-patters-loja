package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.PedidoRepository;

public class TestesPedido {

	
	public static void main(String[] args) {
		
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		
		GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento);
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(List.of(
					new PedidoRepository(),
					new EnviarEmailPedido()
				));
		
		geraPedidoHandler.executar(geraPedido);
	}
	
}
