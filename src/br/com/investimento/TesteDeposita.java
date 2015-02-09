package br.com.investimento;

public class TesteDeposita {

	public static void main(String[] args) {
		
		Conta conta = new Conta("Michel",100.0);
		
		conta.deposita(100.0);
		
		System.out.println(conta.getSaldo());

	}

}
