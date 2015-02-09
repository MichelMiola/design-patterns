package br.com.investimento;

public class RespostaCSV implements Resposta{

	private Resposta proximaResposta;
	
	public RespostaCSV(Resposta proximo) {
		this.proximaResposta = proximo;
	}

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		
		if(requisicao.getFormato() == Formato.CSV){
			System.out.println(conta.getTitular() + " ; " + conta.getSaldo());
		}else if(proximaResposta != null){
			proximaResposta.responde(requisicao, conta);
		}else {
			new Exception("Não exeiste proxima resposta!");
		}
		
		
	}

}
