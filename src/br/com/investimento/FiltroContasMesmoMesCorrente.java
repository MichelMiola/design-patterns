package br.com.investimento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FiltroContasMesmoMesCorrente extends Filtro{
	
	public FiltroContasMesmoMesCorrente() {}
	
	public FiltroContasMesmoMesCorrente(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		
		List<Conta> contasMesCorrente = new ArrayList<Conta>();
		
		for (Conta conta : contas) {
			
			Calendar aliasCalen = Calendar.getInstance();
			
			if(conta.getDataAbertura().get(Calendar.YEAR) == aliasCalen.get(Calendar.YEAR) && 
					conta.getDataAbertura().get(Calendar.MONTH) == aliasCalen.get(Calendar.MONTH)){
				
				contasMesCorrente.add(conta);
				
			}
			
		}
		
		contasMesCorrente.addAll(proximoFiltro(contas));
		return contasMesCorrente;
	}

}
