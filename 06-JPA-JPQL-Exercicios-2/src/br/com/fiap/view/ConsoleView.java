package br.com.fiap.view;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.dao.impl.TransporteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class ConsoleView {
static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		//executar a busca de todos os pacotes
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO pacotedao = new PacoteDAOImpl(em);
		ClienteDAO clidao = new ClienteDAOImpl(em);
		TransporteDAO tdao = new TransporteDAOImpl(em);
		//ListarTodos
		/*
		List<Pacote> lista = dao.listar();
		for (Pacote pacote : lista) {
			System.out.println("Descrição: "+pacote.getDescricao());
		}
		
		
		//Listar por preço
		System.out.println("Digite o preço Máximo: ");
		List<Pacote> pacotes = dao.buscaPrecoMax(entrada.nextFloat());
		imprimirPacotes(pacotes);
		*/
		
		
		//teste ex1
		System.out.println("EXERCICIO 1: ");
		List<Cliente> clientes = clidao.listarClientes();
		imprimirClientes(clientes);
		
		  /*
		//teste ex2
		System.out.println("EXERCICIO 2: ");
		System.out.println("Pesquise um dos transportes");
		Transporte t =tdao.pesquisar(entrada.nextInt());
		List<Pacote> packs = pacotedao.buscaPorTransporte(t);
		imprimirPacotes(packs);
		
		
		//teste ex3
		System.out.println("EXERCICIO 3: ");
		List<Cliente> listaSP = clidao.listarSP();
		imprimirClientes(listaSP);
		
		
		//teste ex4
		System.out.println("EXERCICIO 4: ");
		System.out.println("Digite a qt de dias: ");
		List<Cliente> lista4 = clidao.listarPorQtdias(entrada.nextInt());
		imprimirClientes(lista4);
		// */
	
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
