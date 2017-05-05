package br.com.fiap.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Cliente;

public class SocketServer {
	
	public static void main(String[] args) throws Exception{
		//mais de 8000 (o nº da porta
		ServerSocket server = new ServerSocket(8001);
		System.out.println("Aguardando Conexão");
		
		Socket socket = server.accept();
		
		ObjectInputStream objInputStream = new ObjectInputStream(socket.getInputStream());
		
		Cliente cliente = (Cliente) objInputStream.readObject();

		System.out.println("Nome: "+cliente.getNome());
		System.out.println("RG: "+cliente.getRg());
		
	}

}
