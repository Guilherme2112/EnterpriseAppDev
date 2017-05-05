package br.com.fiap.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTORA")
@SequenceGenerator(name="SQ_PRODUTORA",sequenceName="SQ_PRODUTORA",allocationSize=1)
public class Produtora {
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_PRODUTORA")
		private int codigo;
		
		@Column(name="NM_NOME", nullable=false, length=50)
		private String nome;

		
		//getters  e setters
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		//construtores
		public Produtora() {
		}
		public Produtora(int codigo,String nome){
			this.codigo = codigo;
			this.nome = nome;
		}
}
