package br.com.una.matriz;

import java.security.SecureRandom;

public class Matriz {
	
	public int[][] createMatrizRandon(int x, int y){
		int[][] matriz = new int[x][y];
		SecureRandom random = new SecureRandom();
		for(int i = 0; i < x; i++ ){
			for(int j = 0; j < y; j++){
				matriz[i][j] = random.nextInt(100);
			}
		}
		return matriz;
	}
	
	public String printMatriz(int[][] mat, String title){
		System.out.print(title);
		String texto = "";
		for (int[] vetor : mat){
			texto+= "\n";
			for(int elemento : vetor){
				texto += elemento + " ";
			}
		}
		return texto;
	}
	
	public static int[][] matrizTransposta(int mat[][]){
		int[][] transposta = new int[mat.length][mat.length]; 
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat.length ; j++){
				if(j>i || j<i){
					transposta[i][j] = mat[j][i];
				}
				if(j == i){
					transposta[i][j] = mat[i][j];
				}
			}
		}
		return transposta;
		
	}
	
	public int somaMatDiagonalI(int[][] mat){
		int total = 0;
		for(int i = 0; i< mat.length; i++){
			for(int j = 0; j < mat.length; j++){
				if(i > j){
					total += mat[i][j];
				}
			}
		}
		return total;
		
	}
}
