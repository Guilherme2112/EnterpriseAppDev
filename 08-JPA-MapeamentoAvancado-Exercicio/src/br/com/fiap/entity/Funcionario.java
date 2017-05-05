package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="TB_FUNC")
@SecondaryTable(name="TB_DADOS_FUNC")
@SequenceGenerator(name="seqFunc",sequenceName="SQ_FUNC",allocationSize=1)
public class Funcionario {
	@Id
	@GeneratedValue(generator="seqFunc",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_FUNCIONARIO")
	private int codigo;
	@Column(name="NM_FUNCIONARIO")
	private String nome;
	@Column(name="DT_ADMISSAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dtAdmissao;
	
	@Column(name="VL_SALARIO",table="TB_DADOS_FUNC")
	private double salario;
	
	@Column(name="NR_CONTA",table="TB_DADOS_FUNC")
	private int numConta;
	
		
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
	public Calendar getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(Calendar dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Funcionario(String nome, Calendar dtAdmissao,double salario,int numConta) {
		super();
		this.nome = nome;
		this.dtAdmissao = dtAdmissao;
		this.salario = salario;
		this.numConta = numConta;
	}
	
	
	public Funcionario() {
		super();
	}
}
