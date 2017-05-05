package br.com.fiap.teste;

<<<<<<< HEAD
public class Teste {

	public static void main(String[] args) {
		
	}
=======
import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.PessoaDAOImpl;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PessoaDAO dao = new PessoaDAOImpl(em);
		PessoaJuridica pj = new PessoaJuridica("FIAP","123123123/0123023-22");
		PessoaFisica pf = new PessoaFisica("Guilherme","2020202020");
		
		try{
			dao.cadastrar(pf);
			dao.cadastrar(pj);
			dao.commit();
		}catch(Exception e){
			e.printStackTrace();
		}em.close();
		System.exit(0);
	}
	
>>>>>>> Conceitos de Herança no JPA

}
