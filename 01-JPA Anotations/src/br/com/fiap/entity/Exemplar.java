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
@Table(name="TB_EXEMPLAR")
@SequenceGenerator(name="seqExemplar",sequenceName="SQ_EXEMPLAR",allocationSize=1)
public class Exemplar {
	@Id
	@GeneratedValue(generator="seqExemplar",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_EXEMPLAR")
	private int codigo;
	
	@Column(name="DT_AQUISICAO")
	private Calendar dt_aquisicao;
	
	@Column(name="NR_SITUACAO")
	private int situacao;
	
	//
	private Livro livro;
	
	

}
