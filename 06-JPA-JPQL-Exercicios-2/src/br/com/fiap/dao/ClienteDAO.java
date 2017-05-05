package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{
	List<Cliente> listarClientes();
	List<Cliente> listarSP();
	List<Cliente> listarPorQtdias(int qt);
	List<Cliente> buscar(String nome,String cidade);
	List<Cliente> buscarPorEstado(List<String> estados);
	
}