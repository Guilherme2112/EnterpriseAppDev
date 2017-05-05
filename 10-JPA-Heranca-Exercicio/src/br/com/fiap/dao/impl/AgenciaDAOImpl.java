package br.com.fiap.dao.impl;

import br.com.fiap.entity.Agencia;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AgenciaDAO;

public class AgenciaDAOImpl extends GenericDAOImpl<Agencia, Integer>implements AgenciaDAO{

	public AgenciaDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	

}
