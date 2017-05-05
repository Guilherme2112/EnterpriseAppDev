package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="TB_LIVRO")
@SequenceGenerator(name="seqLivro",sequenceName="SQ_LIVRO",allocationSize=1)
public class Livro {
	@Id
	@GeneratedValue(generator="seqLivro",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_ISBN")
	private int isbn;
	
	
	@Column(name="DS_TITULO")
	private String titulo;
	
	@Column(name="VL_PRECO")
	private float preco;
	
	@Column(name="DT_NASCIMENTO")
	private Calendar dtNascimento;
	
	@Column(name="BT_CAPA")
	private byte[] capa;
	
	@ManyToOne
	@JoinColumn(name= "CD_EDITORA")
	private Editora editora;

}
