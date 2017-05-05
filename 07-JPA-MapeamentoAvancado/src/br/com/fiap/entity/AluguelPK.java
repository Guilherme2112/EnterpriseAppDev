package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

public class AluguelPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7808173684537785547L;
	
	
	private int cliente;
	private int automovel;
	private Calendar dtAluguel;
	
	
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public int getAutomovel() {
		return automovel;
	}
	public void setAutomovel(int automovel) {
		this.automovel = automovel;
	}
	public Calendar getDtAluguel() {
		return dtAluguel;
	}
	public void setDtAluguel(Calendar dtAluguel) {
		this.dtAluguel = dtAluguel;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public AluguelPK(int cliente, int automovel, Calendar dtAluguel) {
		super();
		this.cliente = cliente;
		this.automovel = automovel;
		this.dtAluguel = dtAluguel;
	}
	public AluguelPK() {
		super();
	}
	
	

}
