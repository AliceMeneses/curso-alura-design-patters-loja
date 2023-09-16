package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}
	
	public void executar() {
		Orcamento orcamento = new Orcamento(valorOrcamento, quantidadeItens);
		
		LocalDateTime data = LocalDateTime.now();
		
		Pedido pedido = new Pedido(cliente, data, orcamento);
		
		System.out.println("Salvar pedido no banco de dados");
		System.out.println("Enviar e-mail com dados do novo pedido no banco de dados");
	}
	
}
