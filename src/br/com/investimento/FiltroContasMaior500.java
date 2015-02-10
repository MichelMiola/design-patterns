package br.com.investimento;

import java.util.ArrayList;
import java.util.List;

public class FiltroContasMaior500 extends Filtro{
	
	public FiltroContasMaior500() {}
	
	public FiltroContasMaior500(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasMaior500 = new ArrayList<Conta>();
		
		for (Conta conta : contas) {
			if(conta.getSaldo() > 500){
				contasMaior500.add(conta);
			}
		}
		
		contasMaior500.addAll(proximoFiltro(contas));
		return contasMaior500;
	}

}
