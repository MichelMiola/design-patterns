package br.com.investimento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.imposto.Item;

public class Orcamento {

	protected double valor;
	private final List<Item> itens;
	
	protected EstadoOrcamento estadoAtual;

	public Orcamento (double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();
	}
	
	public void adicionaItens(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public double getValor() {
		return this.valor;
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprovado(this);
	}
	
	public void finaliza() {
		estadoAtual.finalizado(this);
	}
	
}
