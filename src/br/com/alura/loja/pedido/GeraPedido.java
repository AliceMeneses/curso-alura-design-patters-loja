package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	
	public GeraPedido(String cliente, BigDecimal valorOrcamento) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}
	
}
