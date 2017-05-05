package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="T_POUPANCA")
public class ContaPoupanca extends Conta {
	@Column(name="VL_PREENCIMENTO",nullable=false)
	private double preenchimento;
	
	public double getPreenchimento() {
		return preenchimento;
	}
	public void setPreenchimento(double preenchimento) {
		this.preenchimento = preenchimento;
	}
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}
	public ContaPoupanca(double saldo, Agencia agencia,double preenchimento) {
		super(saldo, agencia);
		this.preenchimento = preenchimento;
		// TODO Auto-generated constructor stub	
	}
	
}
