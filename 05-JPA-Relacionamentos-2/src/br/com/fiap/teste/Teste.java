package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TimeDAO;
import br.com.fiap.dao.impl.TimeDAOImpl;
import br.com.fiap.entity.Campeonato;
import br.com.fiap.entity.Jogador;
import br.com.fiap.entity.Tecnico;
import br.com.fiap.entity.Time;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		//cadastrar tudo
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		TimeDAO dao = new TimeDAOImpl(em);
		List<Campeonato> campeonatos = new ArrayList<Campeonato>();
		Tecnico tecnico = new Tecnico(0,"Caio Junior",null);

		Time time = new Time(0, "Chapecoense", new GregorianCalendar(1998, Calendar.NOVEMBER, 21), 3, tecnico, campeonatos);

		campeonatos.add(new Campeonato(0,"Copa do Brasil",null));
		campeonatos.add(new Campeonato(0,"Campeonato Brasileiro Série B",null));
		campeonatos.add(new Campeonato(0,"Campeonato Catarinense",null));
		
		
		Jogador jog1 = new Jogador(0,"Messi",null);
		Jogador jog2 = new Jogador(0,"Goleiro Bruno",null);
		Jogador jog3 = new Jogador(0,"Jorhann Crüijf",null);
		Jogador jog4 = new Jogador(0,"Neymar",null);


		List<Jogador> jogadores = new ArrayList<Jogador>();
		time.addJogador(jog1);	
		time.addJogador(jog2);
		time.addJogador(jog3);
		time.addJogador(jog4);
		

		time.setCampeonato(campeonatos);
		time.setTecnico(tecnico);
		time.setJogadores(jogadores);
		try {
			dao.cadastrar(time);
			dao.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
