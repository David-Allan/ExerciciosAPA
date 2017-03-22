package br.com.una.apa.p01e08;

import br.com.una.matriz.Matriz;

public class SomaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz matriz = new Matriz();
		int mat[][] = matriz.createMatrizRandon(4,4);
		System.out.println(matriz.printMatriz(mat, "Matriz Principal"));
		System.out.println("Soma Diagonal Inferior: " + matriz.somaMatDiagonalI(mat));
	}

}
