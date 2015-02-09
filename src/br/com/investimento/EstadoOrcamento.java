package br.com.investimento;


public interface EstadoOrcamento {
	
	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	void reprovado(Orcamento orcamento);
	void finalizado(Orcamento orcamento);

}
