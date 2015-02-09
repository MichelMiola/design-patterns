package br.com.investimento;


public class EmAprovacao implements EstadoOrcamento {
	
	private boolean foiAplicadoDesconto;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!foiAplicadoDesconto){
			orcamento.valor -= orcamento.valor * 0.05;
			foiAplicadoDesconto = true;
		}else{
			throw new RuntimeException("Desconto j� foi aplicado");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento em aprova��o n�o podem ir direto para finalizado!");
		
	}

}
