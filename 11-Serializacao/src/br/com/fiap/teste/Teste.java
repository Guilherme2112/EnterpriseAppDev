package br.com.fiap.teste;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Cliente;

public class Teste {
	public static void main(String[] args) throws IOException  {
		//serializacao:
		
		//1-gravar as informacoes de um obj em um arquivo
		Cliente cliente = new Cliente("Edu Giba","21313");
		FileOutputStream outStream = new  FileOutputStream("arquivo");
		//como nenhum path foi especificado,o arquivo será criado na pasta raiz do projeto
		ObjectOutputStream objStream = new ObjectOutputStream(outStream);
		try{
		objStream.writeObject(cliente);
		System.out.println("Cliente serializado!");
		}catch(Exception e){
			System.out.println("Algo deu errado");
			objStream.close();
		}
		
	}
	
}
