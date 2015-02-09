package br.com.imposto;

import java.util.ArrayList;
import java.util.List;

import br.com.investimento.Orcamento;
import br.com.investimento.TemplateDeImpostoComdicional;

public class IHIT extends TemplateDeImpostoComdicional{

	public IHIT() {}
	
	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 * orcamento.getItens().size();
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.0;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> nomesItens = new ArrayList<String>();
		
		for (Item item : orcamento.getItens()) {
			if(nomesItens.contains(item.getNome())){
				return true;
			}else{
				nomesItens.add(item.getNome());
			}
		}
		return false;
	}

}
