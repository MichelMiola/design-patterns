package br.com.notaFiscal;

public class NotaFiscalDao implements AcoesDepoisDeGerarNota{

	@Override
	public void execute(NotaFiscal notaFiscal) {
		System.out.println("Salvando nota Fiscal no banco!");
	}

}
