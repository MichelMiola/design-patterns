package br.com.investimento;

import java.util.ArrayList;
import java.util.List;

public class FiltroContasMenor100 extends Filtro {
	
	public FiltroContasMenor100() {}
	
	public FiltroContasMenor100(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasMenor100 = new ArrayList<Conta>();
		
		for (Conta conta : contas) {
			if(conta.getSaldo() < 100){
				contasMenor100.add(conta);
			}
		}
		
		contasMenor100.addAll(proximoFiltro(contas));
		return contasMenor100;
	}

}
