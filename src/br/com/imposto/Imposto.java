package br.com.imposto;

import br.com.investimento.Orcamento;

public abstract class Imposto {
	
	protected Imposto outroImposto;

	public Imposto() {}
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calcularProximoImposto(Orcamento orcamento) {
		return outroImposto == null ? 0 : outroImposto.calcula(orcamento);
	}

}
