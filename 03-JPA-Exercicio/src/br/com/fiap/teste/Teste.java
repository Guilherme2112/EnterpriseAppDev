package br.com.fiap.teste;

import javax.persistence.EntityManagerFactory;

import br.com.fiap.bean.Jogo;
import br.com.fiap.bean.Produtora;
import br.com.fiap.dao.JogoDaoImpl;
import br.com.fiap.dao.ProdutoraDaoImpl;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerSingleton;

public class Teste {

	public static void main(String[] args)throws Exception{
		
		EntityManagerFactory fab = new EntityManagerSingleton().getInstance();
		//cadastrar um jogo
		
		
		/*
		Jogo jogo = new Jogo(0, "Killzone 3", 100, "FPS");
		JogoDaoImpl dao = new JogoDaoImpl(fab.createEntityManager());
		
		try{
		dao.cadastrar(jogo);
		dao.commit();
		}
		catch(CommitException e){
			e.printStackTrace();
		}finally {
			System.out.println("Operação concluída.");
		}
		*/
		
		Produtora prod = new Produtora(0, "Sony");
		ProdutoraDaoImpl dao = new ProdutoraDaoImpl(fab.createEntityManager());
		try{
			dao.cadastrar(prod);
			dao.commit();
		}catch(CommitException e){
			e.printStackTrace();
		}finally {
			System.out.println("Operação Concluída,Eu espero.");
		}

	}

}
