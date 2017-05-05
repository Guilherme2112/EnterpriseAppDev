package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.beans.Livro;

public interface LivroDAO {
	 EntityManagerFactory fab = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
	 EntityManager mng= fab.createEntityManager();
	
	  void c(Livro livro);
	 Livro r(int num);
     void u (Livro livro);
	 void d(int num);
}
