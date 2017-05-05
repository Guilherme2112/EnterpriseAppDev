package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.bean.Produtora;

public class ProdutoraDaoImpl extends GenericDAOImpl<Produtora, Integer> implements GenericDao<Produtora, Integer>  {

	public ProdutoraDaoImpl(EntityManager em){
		super(em);
	}
	

}
