package br.com.fiap.entity;

import javax.persistence.Column;
<<<<<<< HEAD
=======
import javax.persistence.DiscriminatorColumn;
>>>>>>> Conceitos de Herança no JPA
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
<<<<<<< HEAD
@Table(name="TB_JPA_PESSOA")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@SequenceGenerator(name="seqPessoa",sequenceName="SQ_JPA_PESSOA",allocationSize=1)
public class Pessoa {
=======
@Table(name="T_PESSOA")
//@DiscriminatorColumn(name="TIPO_PESSOA")
@Inheritance(strategy=InheritanceType.JOINED)
@SequenceGenerator(name="seqPessoa",sequenceName="SQ_T_PESSOA",allocationSize=1)
public class Pessoa {

>>>>>>> Conceitos de Herança no JPA
	@Id
	@Column(name="CD_PESSOA")
	@GeneratedValue(generator="seqPessoa",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_PESSOA",nullable=false)
	private String nome;
<<<<<<< HEAD
		
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
=======

	public Pessoa() {
		super();
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

>>>>>>> Conceitos de Herança no JPA
	public void setNome(String nome) {
		this.nome = nome;
	}
	
<<<<<<< HEAD
	
	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	public Pessoa() {
		super();
	}
	
	

=======
>>>>>>> Conceitos de Herança no JPA
}
