package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerSingleton {
		//atributo estatico
		private static EntityManagerFactory fabrica;
		//construtor privado
		public EntityManagerSingleton(){}
		//metodo getInstance
		public EntityManagerFactory getInstance(){
			if (fabrica == null){
				fabrica = 
					Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
			}
			return fabrica;
		}
	}

