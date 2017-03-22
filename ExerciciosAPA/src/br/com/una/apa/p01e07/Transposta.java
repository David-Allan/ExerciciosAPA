package br.com.una.apa.p01e07;

import br.com.una.matriz.Matriz;

public class Transposta {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz matriz = new Matriz();
		int mat[][] =  matriz.createMatrizRandon(5,5);
		
		System.out.println(matriz.printMatriz(mat,"Matriz Principal"));
		System.out.println();
		System.out.println(matriz.printMatriz(matriz.matrizTransposta(mat), "Matriz Transposta"));
		
		
	}

}
