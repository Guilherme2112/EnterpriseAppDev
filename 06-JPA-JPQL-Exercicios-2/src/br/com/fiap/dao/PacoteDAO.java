package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{
	List<Pacote>listar();
	List<Pacote>buscaPorTransporte(Transporte t);
	List<Pacote>buscaPrecoMax(float preco);
	List<Pacote>buscarPorIntervalo(Calendar ini,Calendar fim);
	
}
