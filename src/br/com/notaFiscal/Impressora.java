package br.com.notaFiscal;

public class Impressora implements AcoesDepoisDeGerarNota{

	@Override
	public void execute(NotaFiscal notaFiscal) {
		System.out.println("Imprime nota Fiscal!");
	}

}
