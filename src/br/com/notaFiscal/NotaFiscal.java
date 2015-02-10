package br.com.notaFiscal;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	private String razaoSocial;
	private String cnpj;
	private Calendar dataDaEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> itens;
	public String obeservacao;
	
	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDaEmissao,
			double valorBruto, double impostos, List<ItemDaNota> itens,
			String obeservacao) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataDaEmissao = dataDaEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.obeservacao = obeservacao;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getDataDaEmissao() {
		return dataDaEmissao;
	}

	public void setDataDaEmissao(Calendar dataDaEmissao) {
		this.dataDaEmissao = dataDaEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaNota> itens) {
		this.itens = itens;
	}

	public String getObeservacao() {
		return obeservacao;
	}

	public void setObeservacao(String obeservacao) {
		this.obeservacao = obeservacao;
	}

	
	
	
}
