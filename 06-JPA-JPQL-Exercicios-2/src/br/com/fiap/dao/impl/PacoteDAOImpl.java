package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> listar() {
	//Nome da classe (Primeira letra maiuscula)
		//Cria a consulta JPQL em si,similar ao statement e ao preparedstatement
		TypedQuery<Pacote> query = em.createQuery("from Pacote",Pacote.class);
		//Puxa o retorno e o atribui a uma lista do tipo Pacote
		//singleResult = 1 linha/getResultList = várias linhas;
		List<Pacote> pacotes = query.getResultList();
		return pacotes;
	}
	
	
	@Override
	public List<Pacote> buscaPorTransporte(Transporte transp) {
		TypedQuery<Pacote> query = em.createQuery("from Pacote p where p.transporte = :transporte",Pacote.class);
		query.setParameter("transporte", transp);
		List<Pacote> pacotes = query.getResultList();
		return pacotes;
	}

	@Override
	public List<Pacote> buscaPrecoMax(float preco) {
		TypedQuery<Pacote> query = em.createQuery("from Pacote p where p.preco <= :preco",Pacote.class);
		query.setParameter("preco", preco);
		List<Pacote> pacotes = query.getResultList();
		return pacotes;
	}

	@Override
	public List<Pacote> buscarPorIntervalo(Calendar ini, Calendar fim) {
		TypedQuery<Pacote> query = em.createQuery("from Pacote p where p.dataSaida between :inicio and :fim",Pacote.class);
		query.setParameter("inicio", ini);
		query.setParameter("fim", fim);
		List<Pacote> pacotes = query.getResultList();
		return pacotes;
	}

	

}
