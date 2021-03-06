package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ALUNO")
@SequenceGenerator(name="seqAluno",sequenceName="SQ_TB_ALUNO", allocationSize=1)
public class Aluno {

	@Id	
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqAluno")
	private int rm;
	
	@Column(name="NM_ALUNO",nullable=false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="FK_ALUNO_GRUPO")
	private GrupoAm grupo;
	
	public Aluno(int rm, String nome, GrupoAm grupo) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.grupo = grupo;
	}

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GrupoAm getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAm grupo) {
		this.grupo = grupo;
	}
	
}
