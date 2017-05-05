package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_AUTOMOVEL")
@SequenceGenerator(name="seqAuto",allocationSize=1,sequenceName="SQ_AUTOMOVEL")
public class Automovel {
	@Id
	@GeneratedValue(generator="seqAuto",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_AUTOMOVEL")
	private int codigo;
	
	@Column(name="MODELO")
	private String modelo;
	
	@Column(name="MARCA")
	private String marca;
	
	public int getCodigo() {
		return codigo;
	}
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Automovel() {
		super();
	}
	public Automovel(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}
	
	
}
