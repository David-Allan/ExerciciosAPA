package br.com.una.apa.p01e11;

public class FuncionalidadesMapa {
	
	public int[][] insertDistanciaCidades (int cidade1, int cidade2, int distancia, int[][]mat){
		mat[cidade1][cidade2] = distancia;
		mat[cidade2][cidade1] = distancia;
		return mat;	
	}
	
	public int countEstradas(int mat[][]){
		int count = 0;
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat.length; j++){
				if(mat[i][j] > 0){
					count++;
				}
			}
		}
		return count/2;
	}
	
	public int cidadeAdjacente(int mat[][], int cidade1, int cidade2){
		int retorno = (mat[cidade1][cidade2] == mat [cidade2][cidade1]) ? mat[cidade1][cidade2] : 0;		
		
		return retorno;
	}
}
