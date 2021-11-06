package com.example.migracaodados.dominio;

public class DadosBancarios {
	private int id;
	private int pessoaId;
	private int idagencia;
	private int conta;
	private int banco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPessoaId() {
		return pessoaId;
	}
	public void setPessoaId(int pessoaId) {
		this.pessoaId = pessoaId;
	}
	public int getIdagencia() {
		return idagencia;
	}
	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getBanco() {
		return banco;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
}
