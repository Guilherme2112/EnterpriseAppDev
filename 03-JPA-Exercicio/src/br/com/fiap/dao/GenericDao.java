package br.com.fiap.dao;

import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitException;

public interface GenericDao<T,K> {
	void cadastrar(T objToEntity);
	void atualizar(T objToEntity);
	void Excluir(T codigo)throws CodigoInvalidoException;
	T buscar (K codigo);
	void commit() throws CommitException;
}
