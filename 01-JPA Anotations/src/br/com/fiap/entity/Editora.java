package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="TB_EDITORA")
@SequenceGenerator(name="seqEditora",sequenceName="SQ_EDITORA",allocationSize=1)
public class Editora {
	@Id
	@GeneratedValue(generator="seqEditora",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_EDITORA")
	private int id;
	
	@Column(name="DS_CNPJ")
	private String cnpj;
	
	@Column(name="NM_EDITORA")
	private String nome;
	
	@Column(name="NM_SOBRENOME")
	private String sobrenome;
	
	private List<Livro> livros;

}
