package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class Pedido {

	private String cliente;
	private LocalDateTime localDateTime;
	private Orcamento orcamento;
	
	public Pedido(String cliente, LocalDateTime localDateTime, Orcamento orcamento) {
		this.cliente = cliente;
		this.localDateTime = localDateTime;
		this.orcamento = orcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}
	
}
