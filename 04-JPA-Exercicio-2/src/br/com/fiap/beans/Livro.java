package br.com.fiap.beans;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TB_LIVRO")
public class Livro {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int isbn;
	private String titulo;
	private float preco;
	private Calendar dt_lancammento;
	private byte[] foto;
	
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Calendar getDt_lancammento() {
		return dt_lancammento;
	}
	public void setDt_lancammento(Calendar dt_lancammento) {
		this.dt_lancammento = dt_lancammento;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	public Livro(int isbn, String titulo, float preco, Calendar dt_lancammento, byte[] foto) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
		this.dt_lancammento = dt_lancammento;
		this.foto = foto;
	}
	
	public Livro() {
	}
	
	
	

}
