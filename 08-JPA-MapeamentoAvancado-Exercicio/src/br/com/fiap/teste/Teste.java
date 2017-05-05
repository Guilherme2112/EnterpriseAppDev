package br.com.fiap.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.dao.FuncionarioDAO;
import br.com.fiap.dao.impl.DependenteDAOImpl;
import br.com.fiap.dao.impl.FuncionarioDAOImpl;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.Funcionario;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		FuncionarioDAO fDao = new FuncionarioDAOImpl(em);
		DependenteDAO dDao = new DependenteDAOImpl(em);
		
		Funcionario funcA = new Funcionario("Funcionario1", Calendar.getInstance(),1200.50,000112112);
		Dependente dep1 = new Dependente(funcA, "Toninho");
		Dependente dep2 = new Dependente(funcA, "Zezinho");
		Dependente dep3 = new Dependente(funcA, "Juquinha");
		
		try{
			dDao.cadastrar(dep1);
			dDao.cadastrar(dep2);
			dDao.cadastrar(dep3);
			dDao.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		System.exit(0);
	}

}
