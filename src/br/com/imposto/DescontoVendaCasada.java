package br.com.imposto;

import br.com.investimento.Orcamento;


public class DescontoVendaCasada implements Desconto{

	private Desconto proximo;

	@Override
	public double desconto(Orcamento orcamento) {
		
		if(existe("CANETA", orcamento) && existe("LAPIS", orcamento)){
			return orcamento.getValor() * 0.5;
		}else{
			return proximo.desconto(orcamento);
		}
		
	}


	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}

	private boolean existe(String nomeItem, Orcamento orcamento) {
		
		for (Item item : orcamento.getItens()) {
			if(item.getNome().equals(nomeItem)){
				return true;
			}
		}
		return false;
	}
	
	
}
