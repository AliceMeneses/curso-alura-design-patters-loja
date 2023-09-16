package br.com.alura.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.Pedido;

public class TestesPedido {

	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal(600), 4);
		
		String cliente = "Alice";
		LocalDateTime data = LocalDateTime.now();
		
		Pedido pedido = new Pedido(cliente, data, orcamento);
		
		System.out.println("Salvar pedido no banco de dados");
		System.out.println("Enviar e-mail com dados do novo pedido no banco de dados");
	}
	
}
