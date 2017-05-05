package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="TB_TIME")
@SequenceGenerator(name="seqTime",sequenceName="SQ_TIME", allocationSize=1,initialValue=0)
public class Time {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTime")
	private int codigo;
	
	@Column(name="NM_TIME",nullable=false)
	private String nome;
	
	@Column(name="DT_FUNDACAO")
	private Calendar dataFundacao;
	
	@Column(name="NR_TITULO")
	private int titulo;
	
	@OneToOne
	@JoinColumn(name="CD_TECNICO")
	private Tecnico tecnico;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="CD_JOGADOR")
	private List<Jogador> jogadores;
	
	
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
	public Calendar getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	
	public Time(int codigo, String nome, Calendar dataFundacao, int titulo,Tecnico tecnico) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.titulo = titulo;
		this.tecnico = tecnico;
	}
	
	public Time() {
		super();
	}
	
	

}
