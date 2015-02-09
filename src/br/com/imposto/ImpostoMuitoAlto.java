package br.com.imposto;

import br.com.investimento.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto() {}
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calcularProximoImposto(orcamento);
	}

}
