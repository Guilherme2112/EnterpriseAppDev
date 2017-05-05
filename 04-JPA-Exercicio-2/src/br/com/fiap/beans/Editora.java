package br.com.fiap.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_EDITORA")
public class Editora implements Serializable{
	private static final long serialVersionUID = 3868857351565703221L;
	
	@SequenceGenerator(name="editora",sequenceName="SQ_EDITORA",allocationSize=1)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="editora")
	private int id;
	private String cnpj;
	private String nome;
	private  String endereco;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public Editora(int id, String cnpj, String nome, String endereco) {
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Editora() {
	}
	
	
	
	

}
