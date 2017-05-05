package br.com.fiap.view;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class Ex18042017 {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO dao = new PacoteDAOImpl(em);
		//deve imprimir 2700
		Double ex2 = dao.precoMedio();
		System.out.println("Exercício 2: "+ ex2);
		
		//deve imprimir 1...deve ter (tem)algo errado
		Long ex3 = dao.pctsPorData(new GregorianCalendar(2017, 6, 20),
				new GregorianCalendar(2017, 9, 22));

		System.out.println("Exercício 3: "+ex3);
		//deve imprimir 6000-cancun
		List<Pacote> packs = dao.maiorPreco();
		for (Pacote pacote : packs) {
			System.out.println("Maior Preço: "+pacote.getPreco()+"-"+pacote.getDescricao());
		}
	}
	
}
