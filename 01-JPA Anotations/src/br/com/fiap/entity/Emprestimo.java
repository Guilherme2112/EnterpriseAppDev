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
@Table(name="TB_EMPRESTIMO")
@SequenceGenerator(name="seqEmprestimo",sequenceName="SQ_EMPRESTIMO",allocationSize=1)
public class Emprestimo {
	@Id
	@GeneratedValue(generator="seqEmprestimo",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_EMPRESTIMO")
	private int codigo;
	
	@Column(name="DT_NASCIMENTO")
	private Calendar dtNascimento;
	
	@Column(name="DT_RETORNO")
	private Calendar dtRetorno;
	
	//
	private Usuario usuario;
	
}
