package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TimeDAO;
import br.com.fiap.entity.Time;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TimeDAOImpl extends GenericDAOImpl<Time, Integer> implements TimeDAO{
	private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
	public TimeDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
