package br.com.imposto;

import br.com.investimento.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		//N�o tem
		
	}

}
