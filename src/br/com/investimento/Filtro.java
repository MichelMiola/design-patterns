package br.com.investimento;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	protected Filtro outroFiltro;
	
	public Filtro() {}
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	public List<Conta> proximoFiltro(List<Conta> contas) {
		
		if(outroFiltro != null){
			return outroFiltro.filtra(contas);
		}else {
			return new ArrayList<Conta>();
		}
	}

}
