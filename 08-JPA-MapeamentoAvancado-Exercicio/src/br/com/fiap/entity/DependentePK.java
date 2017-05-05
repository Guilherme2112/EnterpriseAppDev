package br.com.fiap.entity;

import java.io.Serializable;

public class DependentePK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private int funcionario;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(int funcionario) {
		this.funcionario = funcionario;
	}
	
	public DependentePK() {
		super();
	}
	public DependentePK(int codigo, int funcionario) {
		super();
		this.codigo = codigo;
		this.funcionario = funcionario;
	}

}
