package br.com.investimento;

public class StatusPositivo implements StatusConta {

	@Override
	public void saca(Conta conta, double valor) {

		conta.saldo -= valor;
		
		if(conta.getSaldo() < 0){
			conta.statusAtualConta = new StatusNegativo();
		}
		
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

}
