package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.acao.EnviarEmailPedido;
import br.com.alura.loja.acao.PedidoRepository;
import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {
		
	public void executar(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		LocalDateTime data = LocalDateTime.now();
		
		Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);
		
		PedidoRepository repository = new PedidoRepository();
		repository.executar(pedido);
		
		EnviarEmailPedido enviarEmailPedido = new EnviarEmailPedido();
		enviarEmailPedido.executar(pedido);
	}

}
