package br.com.una.apa.p01e10;

import br.com.una.matriz.Matriz;

public class Test {

	public static void main(String[] args) {
		Sala sala = new Sala();
		FuncionalidadesSala funcionalidadesSala = new FuncionalidadesSala();
		Matriz matriz = new Matriz();
		
		sala.setLugares(funcionalidadesSala.createMatriz());
		sala.setLugares(funcionalidadesSala.zerarLugares(sala.getLugares()));
		funcionalidadesSala.venderIngressos(sala.getLugares(), 5, 3);
		funcionalidadesSala.venderIngressos(sala.getLugares(), 9, 4);
		funcionalidadesSala.venderIngressos(sala.getLugares(), 5, 5);
		
		double total = funcionalidadesSala.totalApurado(sala.getLugares(), 20);
		System.out.println(matriz.printMatriz(sala.getLugares(), "Secaoo Boyhood\n"));
		System.out.println("Total Apurado:" + total);
		
	}

}
