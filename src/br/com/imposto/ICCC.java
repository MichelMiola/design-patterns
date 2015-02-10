package br.com.imposto;

import br.com.investimento.Orcamento;

public class ICCC extends Imposto{
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICCC() {}

	@Override
	public double calcula(Orcamento orcamento) {
		
		double valor = 0.00;
		
		if(orcamento.getValor() < 1000.0){
			valor = orcamento.getValor() * 0.05 + calcularProximoImposto(orcamento);
		}else if(orcamento.getValor() >= 1000.0 && orcamento.getValor() <= 3000.0){
			valor = orcamento.getValor() * 0.07 + calcularProximoImposto(orcamento);
		}else if(orcamento.getValor() > 3000.0){
			valor = orcamento.getValor() * 0.08 + 30.0 + calcularProximoImposto(orcamento);
		}
		
		return valor;
	}

}
