package br.com.fiap.dao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitException;

public class GenericDAOImpl<T,K> implements GenericDao<T,K>{
	
	private EntityManager em;
	private Class<T> classecomENoFinal; 
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl(EntityManager em) {
		this.em = em;
		classecomENoFinal = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]; 
	}
	
	@Override
	public void cadastrar(T objToEntity) {
		em.persist(objToEntity);
		
	}

	@Override
	public void atualizar(T objToEntity) {
		em.merge(objToEntity);
		
	}

	@Override
	public void Excluir(T codigo) throws CodigoInvalidoException {
		Object T = em.find(classecomENoFinal, codigo);
		em.remove(T);
		
	}

	@Override
	public T buscar(K codigo) {
		return em.find(classecomENoFinal, codigo);
	}

	@Override
	public void commit()throws CommitException{
		try{
			em.getTransaction().begin();
			em.getTransaction().commit();
			}catch(Exception e){
				if(em.getTransaction().isActive()){
					em.getTransaction().rollback();
				}
				e.printStackTrace();
				throw new CommitException("Algo deu errado.");
				
			}
	}
	

}
