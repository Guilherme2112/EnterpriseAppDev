package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Cliente;

public class Desserializacao {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//ler o arquivo e recuperar o objeto.
		
		FileInputStream finput = new FileInputStream("arquivo");
		ObjectInputStream objInps = new ObjectInputStream(finput);
		
		Cliente cliente = (Cliente) objInps.readObject();
		
		System.out.println("Nome: "+cliente.getNome());
		System.out.println("RG: "+cliente.getRg());
		
		objInps.close();
		finput.close();
		System.exit(0);
	}

}
