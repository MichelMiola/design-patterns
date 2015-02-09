package br.com.investimento;

public interface StatusConta {
	
	void saca(Conta conta, double valor);
	void deposita(Conta conta, double valor);

}
