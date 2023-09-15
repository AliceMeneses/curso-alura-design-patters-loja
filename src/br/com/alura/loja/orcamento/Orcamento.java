package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.exception.DomainException;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private Situacao situacao;
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void aplicarDescontoExtra() {
		
		BigDecimal valorDoDescontoExtra;
		
		switch (situacao) {
			case EM_ANALISE:
				valorDoDescontoExtra = new BigDecimal("0.05");
				break;
			case APROVADO:
				valorDoDescontoExtra = new BigDecimal("0.02");
				break;
			default:
				valorDoDescontoExtra = BigDecimal.ZERO;
				break;
		}
		
		valor = valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		switch (situacao) {
			case EM_ANALISE:
				situacao = Situacao.APROVADO;
				break;
			default:
				throw new DomainException("Orçamento não pode ser aprovado");
		}
	}
	
	public void reprovar() {
		switch (situacao) {
			case EM_ANALISE:
				situacao = Situacao.REPROVADO;
				break;
			default:
				throw new DomainException("Orçamento não pode ser aprovado");
		}
	}
	
	public void finalizar() {
		switch (situacao) {
			case APROVADO:
				situacao = Situacao.FINALIZADO;
				break;
			default:
				throw new DomainException("Orçamento não pode ser aprovado");
		}
	}
	
}
