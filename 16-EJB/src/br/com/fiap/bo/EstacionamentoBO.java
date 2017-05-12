package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface EstacionamentoBO {
	public double calcularValor(int horaInicial,int horaFinal);

	
}
