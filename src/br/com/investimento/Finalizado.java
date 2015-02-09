package br.com.investimento;


public class Finalizado implements EstadoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amento finalizado n�o recebem desconto extra!");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� finalizado!");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� finalizado!");
		
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� finalizado!");
		
	}

}
