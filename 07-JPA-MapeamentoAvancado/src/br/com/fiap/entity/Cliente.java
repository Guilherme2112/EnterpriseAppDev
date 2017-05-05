package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(allocationSize=1,name="seqCliente",sequenceName="SQ_CLIENTE")
public class Cliente {
	@Id
	@GeneratedValue(generator="seqCliente",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_CLIENTE")
	private int codigo;
	
	@Column(name="NOME")
	private String nome;
	
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	public Cliente() {
		super();
	}
}
