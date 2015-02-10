
package br.com.investimento;

import java.util.Random;

public class Arrojado implements Investimento{

	private Random random;
	
	public Arrojado() {
		this.random = new Random();
	}
	
	@Override
	public double calcula(Conta conta) {
		double valor = 0.00;
		
		if(random.nextDouble() >= 0.50){
			valor = conta.getSaldo() * 0.025;
		}else if(random.nextDouble() >= 0.30){
			valor = conta.getSaldo() * 0.03;
		}else if(random.nextDouble() >= 0.20){
			valor = conta.getSaldo() * 0.006;
		}
		
		return valor;
	}

}
