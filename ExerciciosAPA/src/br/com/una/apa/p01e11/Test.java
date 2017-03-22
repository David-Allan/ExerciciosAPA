package br.com.una.apa.p01e11;

import br.com.una.matriz.Matriz;

public class Test {

	public static void main(String[] args) {
		int mat[][] = {{0,4,0,5},{4,0,2,4},{0,2,0,3},{5,4,3,0}};
		
		Mapa mapa = new Mapa();
		FuncionalidadesMapa funcionalidadesMapa = new FuncionalidadesMapa();
		Matriz matriz = new Matriz();
		
		mapa.setEstradas(mat);
		
		System.out.println(matriz.printMatriz(mapa.getEstradas(), "Cidades"));
		System.out.println("\nQuantidade de estradas ligando as cidades: " + funcionalidadesMapa.countEstradas(mapa.getEstradas()) + "\n");
		System.out.println("Ligação em Km cidades: " + funcionalidadesMapa.cidadeAdjacente(mapa.getEstradas(), 2, 0 ));
	}

}
