package br.com.fiap.dao.impl;

import br.com.fiap.entity.Funcionario;

import javax.persistence.EntityManager;

import br.com.fiap.dao.FuncionarioDAO;

public class FuncionarioDAOImpl extends GenericDAOImpl<Funcionario, Integer> implements FuncionarioDAO{

	public FuncionarioDAOImpl(EntityManager em) {
		super(em);
	}

}
