package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_AGENCIA")
@SequenceGenerator(name="seqAgencia",allocationSize=1,sequenceName="SQ_AGENCIA")
public class Agencia {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqAgencia")
	@Column(name="NR_AGENCIA")
	private int codigo;
	@Column(name="DS_ENDERECO")
	private String endereco;

	
	public int getCodigo() {
		return codigo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Agencia() {
		// TODO Auto-generated constructor stub
	}
	public Agencia(String endereco) {
		super();
		this.endereco = endereco;
	}
	
}
