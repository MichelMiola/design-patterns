package br.com.investimento;

import java.util.List;

public abstract class Relatorio {
	
	protected abstract void cabecalho();
	protected abstract void corpo(List<Conta> contas);
	protected abstract void rodape();
	
	protected void imprime(List<Conta> contas){
		cabecalho();
		corpo(contas);
		rodape();
	}

}
