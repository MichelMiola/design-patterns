package br.com.notaFiscal;


public class testeNotaFiscal {

	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Caelum Ensino e Inovação")
		.comCnpj("12.345678/0111-12")
		.com(new ItemDaNotaBuilder().comNome("Item 1").comValor(200.0).constroi())
		.com(new ItemDaNotaBuilder().comNome("Item 2").comValor(300.0).constroi())
		.com(new ItemDaNotaBuilder().comNome("Item 3").comValor(400.0).constroi())
		.comObeservacao("Obeservação");
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
		
	}
	
}
