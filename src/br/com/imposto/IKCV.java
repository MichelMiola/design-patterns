package br.com.imposto;

import br.com.investimento.Orcamento;
import br.com.investimento.TemplateDeImpostoComdicional;

public class IKCV extends TemplateDeImpostoComdicional{

	public IKCV() {}
	
	public IKCV(Imposto imposto) {
		super(imposto);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		
		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100){
				return true;
			}
		}
		return false;
	}
	
	
}
