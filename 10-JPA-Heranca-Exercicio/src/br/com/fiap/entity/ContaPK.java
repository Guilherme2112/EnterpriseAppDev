package br.com.fiap.entity;

import java.io.Serializable;

public class ContaPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int codigo;

	private int agencia;
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public ContaPK(int codigo,int agencia) {
		super();
		this.codigo = codigo;
		this.agencia = agencia;
	}

	public ContaPK() {
		super();
	}
	
	
	
}
