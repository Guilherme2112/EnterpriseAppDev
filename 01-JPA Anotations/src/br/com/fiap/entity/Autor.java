package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="TB_AUTOR")
@SequenceGenerator(name="seqAutor",sequenceName="SQ_AUTOR",allocationSize=1)
public class Autor {
	@Id
	@GeneratedValue(generator="seqAutor",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_AUTOR")
	private int codigo;
	
	@Column(name="NM_AUTOR")
	private String nome;
	
	@Column(name="SX_AUTOR")
	private int sexo;
	
	@Column(name="NM_SOBRENOME")
	private String sobrenome;
	
	@Column(name="DT_NASCIMENTO")
	private Calendar dtNascimento;
	
	
	
}
