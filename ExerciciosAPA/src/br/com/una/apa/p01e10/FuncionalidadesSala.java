package br.com.una.apa.p01e10;

public class FuncionalidadesSala {
	
	public int[][] createMatriz(){
		int[][] mat = new int[10][10];

		return mat;		
	}
	
	public int[][] zerarLugares(int[][] mat){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat.length; j++){
			mat[i][j] = 0;
			}
		}
		return mat;
	}
	
	public int[][] venderIngressos(int[][] mat, int i, int j){
		mat[i][j] = 1;
		return mat;
	}
	
	public double totalApurado(int session[][], double valor){
		double total = 0;
		for(int i = 0; i < session.length; i++){
			for(int j = 0; j < session.length; j++){
				if(session[i][j] == 1){
					total++;
				}
			}
		}
		total*= valor;
		return total;	
	}
}
