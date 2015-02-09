package br.com.investimento;

import java.util.Calendar;

public class Conta {
	
	private String titular;	
	protected double saldo;
	private Long numero;
	private String agencia;
	private Calendar dataAbertura;
	protected StatusConta statusAtualConta;
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		
		statusAtualConta = this.saldo > 0 ? new StatusPositivo() 
			: new StatusNegativo();
		
	}
	
	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public void deposito(double valor) {
		this.saldo += valor;
	}	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void saca(double valor) {
		statusAtualConta.saca(this, valor);
	}
	
	public void deposita(double valor) {
		statusAtualConta.deposita(this, valor);
	}

}
