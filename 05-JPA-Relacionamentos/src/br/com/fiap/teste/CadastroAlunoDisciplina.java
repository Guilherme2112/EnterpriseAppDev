package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.DisciplinaDAO;
import br.com.fiap.dao.impl.DisciplinaDAOImpl;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Disciplina;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroAlunoDisciplina {
	public static void main(String[]args){
		//cadastrar alunos e disciplina
		EntityManagerFactory fab = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fab.createEntityManager();
		
		Aluno a1 = new  Aluno(0,"Guilherme",null);
		Aluno a2 = new Aluno(0,"Garganta",null);
		List<Aluno> alunos = new ArrayList<Aluno>();
		Disciplina d1 = new Disciplina(0,"Programação II",100,"Java",alunos);
		Disciplina d2 = new Disciplina(0,"Banco",150,"Oacle",alunos);
		alunos.add(a1);
		alunos.add(a2);
		//instanciar o DAO
		DisciplinaDAO dao = new DisciplinaDAOImpl(em);
		try {
			dao.cadastrar(d1);
			dao.cadastrar(d2);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			em.close();
			fab.close();
		}
	}

}
