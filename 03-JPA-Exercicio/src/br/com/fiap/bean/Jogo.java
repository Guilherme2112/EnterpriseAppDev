package br.com.fiap.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_JOGO")
@SequenceGenerator(name="SQ_JOGO",sequenceName="SQ_JOGO",allocationSize=1)
public class Jogo {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_JOGO")
	private int cd_jogo;
	
	@Column(name="DS_TITULO", nullable=false, length=100)
	private String ds_titulo;
	
	@Column(name="VL_JOGO",nullable=false)
	private double vl_jogo;
	
	@Column(name="DS_GENERO",nullable=true,length=30)
	private String ds_genero;
	
	

	//getters e setters
	public int getCd_jogo() {
		return cd_jogo;
	}
	public void setCd_jogo(int cd_jogo) {
		this.cd_jogo = cd_jogo;
	}
	public String getDs_titulo() {
		return ds_titulo;
	}
	public void setDs_titulo(String ds_titulo) {
		this.ds_titulo = ds_titulo;
	}
	public double getVl_jogo() {
		return vl_jogo;
	}
	
	public void setVl_jogo(double vl_jogo) {
		this.vl_jogo = vl_jogo;
	}
	public String getDs_genero() {
		return ds_genero;
	}
	public void setDs_genero(String ds_genero) {
		this.ds_genero = ds_genero;
	}
	
	//construtores
	
	public Jogo(int cd_jogo, String ds_titulo, double vl_jogo, String ds_genero) {
		this.cd_jogo = cd_jogo;
		this.ds_titulo = ds_titulo;
		this.vl_jogo = vl_jogo;
		this.ds_genero = ds_genero;
	}
	public Jogo() {
	}
	
	

}
