package br.com.una.apa.p01e06;

import br.com.una.matriz.Matriz;

public class DiagonaisMatriz {
	
	public static int[] diagonalPrincipal(int mat[][]){
		int[] diagonal = new int[mat.length];
		for(int i = 0; i < mat.length; i++){
			diagonal[i] = mat[i][i];
		}
		
		return diagonal;
	}
	
	public static int[] diagonalSecundaria(int mat[][]){
		int[] diagonal = new int[mat.length];
		for(int i = 0; i < mat.length; i++){
			diagonal[i] = mat[i][mat.length-1-i];
		}
		
		return diagonal;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz matriz = new Matriz();
		
		int mat[][] = matriz.createMatrizRandon(10, 10);
		
		int[] diagonalP = diagonalPrincipal(mat);
		int[] diagonalS = diagonalSecundaria(mat);
		
		System.out.print("Matriz Principal:");
		for (int[] vetor : mat){
			System.out.println();
			for(int elemento : vetor){
				System.out.print(elemento + " ");
			}
		}
		
		System.out.println();
		System.out.println("\nDiagonal Principal:");
		for (int diagonals : diagonalP){
			System.out.print(diagonals + " ");
		}
		
		System.out.println();
		System.out.println("\nDiagonal Secundaria:");
		for (int diagonals : diagonalS){
			System.out.print(diagonals + " ");
		}
	}

}
