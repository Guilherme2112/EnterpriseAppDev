package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CONTA")
@Inheritance(strategy= InheritanceType.JOINED)
@IdClass(ContaPK.class)
public class Conta {
	@Id
	@SequenceGenerator(name="seqConta",allocationSize=1,sequenceName="SQ_CONTA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqConta")
	@Column(name="NR_CONTA")
	private int codigo;
	@Column(name="VL_SALDO",nullable=false)
	private double saldo;
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="NR_AGENCIA")
	private Agencia agencia;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Conta(double saldo, Agencia agencia) {
		super();
		this.saldo = saldo;
		this.agencia = agencia;
	}
	public Conta() {
	}
	
}
