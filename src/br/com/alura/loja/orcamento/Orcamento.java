package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<Orcavel> itens = new ArrayList<>();
	
	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		situacao = new EmAnalise();
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeItens() {
		return itens.size();
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

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}
	
	public void adicionarItem(Orcavel item) {
		valor = valor.add(item.getValor());
		itens.add(item);
	}
	
}
