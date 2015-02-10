package br.com.notaFiscal;

public class SMS implements AcoesDepoisDeGerarNota{

	@Override
	public void execute(NotaFiscal notaFiscal) {
		System.out.println("Enviando SMS!");
	}

}
