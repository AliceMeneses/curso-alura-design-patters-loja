package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
		
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void executar(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));
		
		LocalDateTime data = LocalDateTime.now();
		
		Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);
		
		acoes.forEach(a -> a.executar(pedido));
	}

}
