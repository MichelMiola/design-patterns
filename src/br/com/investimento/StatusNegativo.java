package br.com.investimento;

public class StatusNegativo implements StatusConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Não é possivel sacar porque a conta esta negativa!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		
		if(conta.getSaldo() > 0){
			conta.statusAtualConta = new StatusPositivo();
		}
	}

}
