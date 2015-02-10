package br.com.investimento;


public class RespostaPorcentagem implements Resposta{

	private Resposta proximaResposta;
	
	public RespostaPorcentagem(Resposta proximo) {
		this.proximaResposta = proximo;
	}

	@Override
	public void responde(Requisicao requisicao, Conta conta) {

		if(requisicao.getFormato() == Formato.PORCENTO){
			System.out.println(conta.getTitular() + " % " + conta.getSaldo());
		}else if(proximaResposta != null){
			proximaResposta.responde(requisicao, conta);
		}else {
			throw new RuntimeException("Não exeiste proxima resposta!");
		}
		
	}

}
