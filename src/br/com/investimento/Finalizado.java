package br.com.investimento;


public class Finalizado implements EstadoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado não recebem desconto extra!");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado!");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado!");
		
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado!");
		
	}

}
