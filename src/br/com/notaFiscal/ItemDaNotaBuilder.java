package br.com.notaFiscal;

public class ItemDaNotaBuilder {
	
	private String descricao;
	private double valor;

	public ItemDaNotaBuilder comNome(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public ItemDaNotaBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemDaNota constroi() {
		return new ItemDaNota(descricao, valor);
	}
}
