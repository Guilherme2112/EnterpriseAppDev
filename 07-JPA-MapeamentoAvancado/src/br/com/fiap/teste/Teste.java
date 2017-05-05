package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AluguelDAO;
import br.com.fiap.dao.impl.AluguelDAOImpl;
import br.com.fiap.entity.Aluguel;
import br.com.fiap.entity.Automovel;
import br.com.fiap.entity.Cliente;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		AluguelDAO dao = new AluguelDAOImpl(em);
		
		Cliente cli1 = new Cliente("ClienteA");
		Cliente cli2 = new Cliente("ClienteB");

		Automovel a1 = new Automovel("BF-109", "MesserSChmitt");
		Automovel a2 = new Automovel("Leopard 2","RheinMettal");
		
		
		
		Aluguel al1 = new Aluguel(cli1,a1,Calendar.getInstance(),new GregorianCalendar(2016, 1, 1),2000.0);
		Aluguel al2 = new Aluguel(cli1,a2,Calendar.getInstance(),new GregorianCalendar(2015, 1, 1),2100.0);
		Aluguel al3 = new Aluguel(cli2,a1,Calendar.getInstance(),new GregorianCalendar(2014, 1, 1),2200.0);
		Aluguel al4 = new Aluguel(cli2,a2,Calendar.getInstance(),new GregorianCalendar(2013, 1, 1),2300.0);

		try{
		dao.cadastrar(al1);
		dao.cadastrar(al2);
		dao.cadastrar(al3);
		dao.cadastrar(al4);
		dao.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}

}
