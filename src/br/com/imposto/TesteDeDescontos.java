package br.com.imposto;

import br.com.investimento.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {

		CalculadoraDesconto desconto = new CalculadoraDesconto();
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItens(new Item("CANETA", 250.0));
		orcamento.adicionaItens(new Item("LAPIS", 250.0));
		
		double descontoFinal = desconto.calcula(orcamento);
		
		System.out.println(descontoFinal);
		
		
	}

}
