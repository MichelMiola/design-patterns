package br.com.notaFiscal;

public class Multiplicador implements AcoesDepoisDeGerarNota{

	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}
	
	@Override
	public void execute(NotaFiscal notaFiscal) {
		System.out.println("Multiplicação : " + notaFiscal.getValorBruto() * fator);
		
	}

}
