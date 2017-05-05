package br.com.fiap.beans;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_AUTOR")
public class Autor {
	@Id
	@SequenceGenerator(name="autor",sequenceName="SQ_AUTOR",allocationSize=1)
	@GeneratedValue()
	private int id;
	private String nome;
	private Sexo sexo;
	private String sobrenome;
	
	@Temporal(TemporalType.DATE)
	private Calendar dtNascimento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Calendar getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public Autor(int id, String nome, Sexo sexo, String sobrenome, Calendar dtNascimento) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.sobrenome = sobrenome;
		this.dtNascimento = dtNascimento;
	}
	public Autor() {
	}
	
	
	
	
	
	
	

}
