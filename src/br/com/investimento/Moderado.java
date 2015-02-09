package br.com.investimento;

import java.util.Random;

public class Moderado implements Investimento{
	
	private Random random;
	
	public Moderado() {
		this.random = new Random();
	}

	@Override
	public double calcula(Conta conta) {
		
		double valor = 0.00;
		
		if(random.nextInt(2) == 0){
			valor = conta.getSaldo() * 0.025;
		}else {
			valor = conta.getSaldo() * 0.007;
		}
		
		return valor;
	}

}
