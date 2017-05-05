package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
@SequenceGenerator(name="seqUsuario",sequenceName="SQ_USUARIO",allocationSize=1)
public class Usuario {
	
	@Id
	@GeneratedValue(generator="seqUsuario",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_USUARIO")
	private int codigo;
	
	@Column(name="NM_APELIDO")
	private String nickname;
	
	@Column(name="NM_USUARIO")
	private String nome;
	@Column(name="NM_SOBRENOME")
	private String sobrenome;
	
	@Column(name="NR_CPF")
	private String cpf;
	
	
}
