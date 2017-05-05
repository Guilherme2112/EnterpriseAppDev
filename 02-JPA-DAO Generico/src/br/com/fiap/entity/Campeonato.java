package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="TB_CAMPEONATO")
@SequenceGenerator(name="seqCampeonato",sequenceName="SQ_CAMPEONATO",allocationSize=1)
public class Campeonato {
	@Id
	@Column(name="CD_CAMPEONATO")
	@GeneratedValue(generator="seqCampeonato",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NM_CAMPEONATO")
	private String nome;
	@ManyToMany
	@JoinTable(name="TB_TIME_CAMPEONATO",
	joinColumns={@JoinColumn(name="CD_TIME")},
	inverseJoinColumns={@JoinColumn(name="CD_CAMPONATO")})
	private List<Time> times;
	
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
	
	
	
	public Campeonato(int codigo, String nome,List<Time>times) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.times = times;
	}
	public Campeonato() {
		super();
	}
	

}
