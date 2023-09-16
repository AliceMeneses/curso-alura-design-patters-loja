package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		situacao = new EmAnalise();
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	public void aplicarDescontoExtra() {
		
		BigDecimal valorDoDescontoExtra = situacao.calcularValorDescontoExtra(this);
		
		valor = valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		situacao.aprovar(this);
	}
	
	public void reprovar() {
		situacao.reprovar(this);
	}
	
	public void finalizar() {
		situacao.finalizar(this);
	}
	
}
