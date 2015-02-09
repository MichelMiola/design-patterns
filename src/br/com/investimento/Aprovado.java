package br.com.investimento;


public class Aprovado implements EstadoOrcamento {
	
	private boolean foiAplicadoDesconto;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!foiAplicadoDesconto){
			orcamento.valor -= orcamento.valor * 0.02;
			foiAplicadoDesconto = true;
		}else{
			throw new RuntimeException("Desconto já foi aplicado");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já está aprovado");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser reprovados");
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
