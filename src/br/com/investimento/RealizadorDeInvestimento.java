package br.com.investimento;

public class RealizadorDeInvestimento {
	
	public void realiza(Conta conta,Investimento investimento) {
		
		double resultado = investimento.calcula(conta);
		conta.deposito(resultado * 0.75);
		
		System.out.println(conta.getSaldo());
		
	}

}
