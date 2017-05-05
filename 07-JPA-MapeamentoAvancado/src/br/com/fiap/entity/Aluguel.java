package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="TB_ALUGUEL")
@IdClass(AluguelPK.class)
public class Aluguel {
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_CLIENTE")
	private Cliente cliente;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_AUTOMOVEL")
	private Automovel automovel;
	
	@Id
	@Column(name="DT_ALUGUEL")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dtAluguel;
	
	@Column(name="DT_DEVOLUCAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dtDevolucao;
	
	@Column(name="VL_ALUGUEL")
	private double valor;
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Automovel getAutomovel() {
		return automovel;
	}
	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
	public Calendar getDtAluguel() {
		return dtAluguel;
	}
	public void setDtAluguel(Calendar dtAluguel) {
		this.dtAluguel = dtAluguel;
	}
	public Calendar getDtDevolucao() {
		return dtDevolucao;
	}
	public void setDtDevolucao(Calendar dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public Aluguel(Cliente cliente, Automovel automovel, Calendar dtAluguel, Calendar dtDevolucao, double valor) {
		super();
		this.cliente = cliente;
		this.automovel = automovel;
		this.dtAluguel = dtAluguel;
		this.dtDevolucao = dtDevolucao;
		this.valor = valor;
	}
	public Aluguel() {
		super();
	}
	
	
}
