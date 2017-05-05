package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cidade;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	//1
	@Override
	public List<Cliente> listarClientes() {
		TypedQuery<Cliente> query = em.createQuery("from Cliente",Cliente.class);
		query.setMaxResults(3);
		return query.getResultList();
	}
	
	
	//3
	@Override
	public List<Cliente> listarSP() {
		Cidade sp = em.createQuery("from Cidade c where c.id=2",Cidade.class).getSingleResult();
		TypedQuery<Cliente> query = em.createQuery("from Cliente c where c.endereco.cidade =:cidade",Cliente.class);
		query.setParameter("cidade", sp);
		List<Cliente>lista = query.getResultList();
		return lista;
	}

	//4
	@Override
	public List<Cliente> listarPorQtdias(int qt) {
		TypedQuery<Cliente> query = em.createQuery("select r.cliente from Reserva r where r.numeroDias =:qt",Cliente.class);
		query.setParameter("qt", qt);
		List<Cliente>lista = query.getResultList();
		return lista;
	}

	@Override
	public List<Cliente> buscar(String nome, String cidade) {
		TypedQuery<Cliente> query = em.createQuery("from Cliente c where c.nome like :n and c.endereco in(':cidade')",Cliente.class);
		query.setParameter("%n%", nome);
		query.setParameter("cidade", cidade);
		List<Cliente>lista = query.getResultList();
		return lista;
	}

	@Override
	public List<Cliente> buscarPorEstado(List<String> estados) {
		TypedQuery<Cliente> query = em.createQuery("from Cliente c where c.endereco.cidade.uf in :estados",Cliente.class);
		query.setParameter("estados", estados);
		List<Cliente>lista = query.getResultList();
		return lista;
	}


	
	
}
