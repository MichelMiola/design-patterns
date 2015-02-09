package br.com.investimento;

import br.com.imposto.Imposto;

//
// TEMPLATE METHOD
//

public abstract class TemplateDeImpostoComdicional extends Imposto{
	
	public TemplateDeImpostoComdicional() {}

	public TemplateDeImpostoComdicional(Imposto imposto) {
		super(imposto);
	}
	

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento) + calcularProximoImposto(orcamento);
		}else{
			return minimaTaxacao(orcamento) + calcularProximoImposto(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento); 
	protected abstract double maximaTaxacao(Orcamento orcamento);
	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
