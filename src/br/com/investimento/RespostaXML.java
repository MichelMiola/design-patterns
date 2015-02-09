package br.com.investimento;

public class RespostaXML implements Resposta{

	private Resposta proximaResposta;
	
	public RespostaXML(Resposta proxima) {
		this.proximaResposta = proxima;
	}

	@Override
	public void responde(Requisicao requisicao, Conta conta) {

		if(requisicao.getFormato() == Formato.XML){
			
			System.out.println("<conta>" 
									+ "<titular>" + conta.getTitular() + "</titular> \n " 
									+ "<saldo>" + conta.getSaldo() + "</saldo>" +
								"</conta>");
		}else if(proximaResposta != null){
			proximaResposta.responde(requisicao, conta);
		}else {
			throw new RuntimeException("Não exeiste proxima resposta!");
		}
		
	}

}
