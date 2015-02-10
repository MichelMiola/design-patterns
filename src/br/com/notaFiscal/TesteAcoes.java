package br.com.notaFiscal;

import java.util.ArrayList;
import java.util.List;

public class TesteAcoes {

	public static void main(String[] args) {
		List<AcoesDepoisDeGerarNota> acoes = new ArrayList<AcoesDepoisDeGerarNota>();
		acoes.add(new Impressora());
		acoes.add(new NotaFiscalDao());
		acoes.add(new SMS());
		acoes.add(new Email());
		acoes.add(new Multiplicador(2));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);

		NotaFiscal nf = builder
				.paraEmpresa("PariPassu")
				.com(new ItemDaNotaBuilder().comNome("Item 1").comValor(200.0)
						.constroi()).comObeservacao("obs").constroi();
		
		
	}
}
