package br.com.investimento;


public class Reprovado implements EstadoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem receber descontos extra!");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovados não podem ser aprovados!");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já foi reprovado!");
		
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
