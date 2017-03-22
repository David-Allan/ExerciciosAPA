package br.com.una.apa.p01e04;

import br.com.una.apa.p01e03.ParImpar;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParImpar vet = new ParImpar();
		int[]vector = vet.createVector();
		
		System.out.println("ARRAY ORIGINAL");
		for	(int vectors : vector){
			System.out.print(vectors + " ");
		}
		
		TrocaFL fl = new TrocaFL();
			
		System.out.println("\n\nARRAY FL");
		for	(int vectors : fl.trocaPosicao(vector)){
			System.out.print(vectors + " ");
		}
				
	}

}
