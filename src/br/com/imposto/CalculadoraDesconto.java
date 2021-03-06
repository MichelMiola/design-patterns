package br.com.imposto;

import br.com.investimento.Orcamento;

public class CalculadoraDesconto {

	
	public double calcula(Orcamento orcamento) {
		
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		
		return d1.desconto(orcamento);
	}
	
}
