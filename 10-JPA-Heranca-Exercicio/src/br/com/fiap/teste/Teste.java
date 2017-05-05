package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaDAO;
import br.com.fiap.dao.impl.ContaDAOImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.entity.ContaPoupanca;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ContaDAO cdao = new ContaDAOImpl(em);
		//AgenciaDAO adao = new AgenciaDAOImpl(em);
		
		Agencia a1 = new Agencia("SomewhereOverTheRainbow");
		ContaCorrente cc1 = new ContaCorrente( 2112.5, a1, 10.2, 0.015);
		ContaPoupanca cp1 = new ContaPoupanca( 2113.5, a1, 14.0);
		try {
			cdao.cadastrar(cp1);
			cdao.cadastrar(cc1);
			cdao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
	}

}
