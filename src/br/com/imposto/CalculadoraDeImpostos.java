package br.com.imposto;

import br.com.investimento.Orcamento;


public class CalculadoraDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		
		double icms = impostoQualquer.calcula(orcamento);
		System.out.println(icms);
		
	}
	
}
