package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	List<Cliente> listar();
	
	List<Cliente> buscarPorEstado(String estado);
	
	List<Cliente> buscarPorDiaReserva(int dias);
	
	List<Cliente> buscarPorNome(String nome);
	
	List<Cliente> buscar(String nome, String cidade);
	
	List<Cliente> buscarPorEstado(List<String> estados);
	
	//Contar a quantidade de clientes cadastrados 
	long contar();
//namedQuery- buscarPorCPF
	public Cliente buscarPorCPF(String cpf);
	
}










