package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.beans.Autor;
import br.com.fiap.beans.Editora;
import br.com.fiap.beans.Livro;
import br.com.fiap.beans.Sexo;
import br.com.fiap.dao.LivroDAO;

public class Teste {
	
	public static void main(String[] args) {
		EntityManagerFactory fab = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager mng = fab.createEntityManager();
		
		Editora editora = new Editora(0, "000000000", "Abril", "Rua dos existentes");
		Autor autor = new Autor(0, "Viktor", Sexo.MALAKOI, "Frankl", new GregorianCalendar(1998, Calendar.FEBRUARY, 27));
		Livro livro = new Livro(4, "m busca", 60, new GregorianCalendar(2002,Calendar.NOVEMBER,15), null);
		/*
		mng.persist(editora);
		mng.persist(autor);
		mng.persist(livro);
		
		mng.getTransaction().begin();
		mng.getTransaction().commit();
		*/
		LivroDAO.d(4);
		
		mng.close();
		fab.close();
		
		
		
	}

}
