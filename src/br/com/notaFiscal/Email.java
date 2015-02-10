package br.com.notaFiscal;

public class Email implements AcoesDepoisDeGerarNota{

	@Override
	public void execute(NotaFiscal notaFiscal) {
		System.out.println("Enviando Email de Nota Fiscal");
	}

}
