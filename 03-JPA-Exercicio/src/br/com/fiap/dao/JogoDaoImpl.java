package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.bean.Jogo;

public class JogoDaoImpl extends GenericDAOImpl<Jogo, Integer>
implements JogoDAO{
	
	public JogoDaoImpl(EntityManager em) {
		super(em);
	}
}
