package br.com.imposto;

import br.com.investimento.Orcamento;


public class TesteImpostoComplexos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500.0);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
	}
	
}
