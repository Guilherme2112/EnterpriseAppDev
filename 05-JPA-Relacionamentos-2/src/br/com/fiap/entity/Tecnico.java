package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_TECNICO")
@SequenceGenerator(name="seqTecnico",sequenceName="SQ_TECNICO",allocationSize=1)
public class Tecnico {
	@Id
	@Column(name="CD_TECNICO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTecnico")
	private int codigo;
	@Column(name="NM_TECNICO")
	private String nome;
	
	@OneToOne(mappedBy="tecnico",cascade=CascadeType.PERSIST,fetch=FetchType.LAZY)
	private Time time;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Time getTime() {
		return time;
	}
		
	public Tecnico(int codigo, String nome,Time time) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.time= time;
	}
	public Tecnico() {
		super();
	}

}
