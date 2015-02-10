package br.com.imposto;

import br.com.investimento.Orcamento;

public interface Desconto {
	
	double desconto(Orcamento orcamento);	
	void setProximo(Desconto proximo);

}
