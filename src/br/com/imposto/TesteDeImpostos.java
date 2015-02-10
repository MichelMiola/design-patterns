package br.com.imposto;

import br.com.investimento.Orcamento;


public class TesteDeImpostos {
	
	public static void main(String[] args) {
		Imposto iss = new ISS();
		/*Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(1000.0);
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		//calculadora.realizaCalculo(orcamento, iss);
		//calculadora.realizaCalculo(orcamento, icms);
		calculadora.realizaCalculo(orcamento, iccc);*/
		
		Imposto imposto = new IKCV(iss);
		
		Orcamento orcamento = new Orcamento(500.0);
		
		System.out.println(imposto.calcula(orcamento));
		
	}

}
