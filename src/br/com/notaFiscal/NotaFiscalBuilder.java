package br.com.notaFiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private String obeservacao;
	private Calendar dataDaEmissao;
	
	private List<ItemDaNota> itensDaNota = new ArrayList<ItemDaNota>();
	private List<AcoesDepoisDeGerarNota> todasAsAcoes;
	
	public NotaFiscalBuilder() {
		this.dataDaEmissao = Calendar.getInstance();
		this.todasAsAcoes = new ArrayList<AcoesDepoisDeGerarNota>();
	}
	
	public NotaFiscalBuilder(List<AcoesDepoisDeGerarNota> acoes) {
		this.dataDaEmissao = Calendar.getInstance();
		this.todasAsAcoes = acoes;
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoaSocial) {
		this.razaoSocial = razaoaSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder com(ItemDaNota item) {
		itensDaNota.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObeservacao(String obeservacao) {
		this.obeservacao = obeservacao;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data) {
		this.dataDaEmissao = data;
		return this;
	}
	
	public NotaFiscal constroi() {
		 NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataDaEmissao, valorBruto, impostos, itensDaNota, obeservacao);
		
		for (AcoesDepoisDeGerarNota acoes : todasAsAcoes) {
			acoes.execute(nf);
		}
		
		return nf;
	}
	
	

}
