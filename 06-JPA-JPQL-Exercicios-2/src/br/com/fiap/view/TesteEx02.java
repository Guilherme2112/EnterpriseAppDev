package br.com.fiap.view;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;

public class TesteEx02 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO cdao = new ClienteDAOImpl(em);
		PacoteDAO pdao = new PacoteDAOImpl(em);
		
		System.out.println("EXERCÍCIO 1"); 	// deve retornar dois pacotes
		List<Pacote>e1 = pdao.buscarPorIntervalo
		(new GregorianCalendar(2017, 05, 19), new GregorianCalendar(2017, 8, 13));
		imprimirPacotes(e1);
		
		
		System.out.println("EXERCÍCIO 2"); 	//deve imprimir Maria
		List<Cliente> e2 = cdao.buscar("ari", "Salvador");
		imprimirClientes(e2);
		
		System.out.println("EXERCÍCIO 3");  //Não deve retornar o Leandro
		List<String> estados = new ArrayList<String>();
		estados.add("SP");
		estados.add("BA");
		List<Cliente> e3 = cdao.buscarPorEstado(estados);
		imprimirClientes(e3);
		em.close();
		System.exit(0);
	}
	
	
	public static void imprimirPacotes(List<Pacote> pacotes) {
		for (Pacote pacote : pacotes) {
			System.out.println("Descrição: "+pacote.getDescricao()+"\t"+"Preço: "+pacote.getPreco());
		}
	}
	public static void imprimirClientes(List<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			System.out.println("Nome: "+cliente.getNome());
		}
	}
}
