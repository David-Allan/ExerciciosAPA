package br.com.una.apa.p01e04;

import br.com.una.apa.p01e03.ParImpar;

public class TrocaFL {
	public String PrintFL(){
		ParImpar vet = new ParImpar();
		int vector[] = vet.createVector();
		return null;
		
	}
	
	public int[] trocaPosicao(int vet[]){
		int tamanho = vet.length;
		int first = vet[0];
		int last = vet[tamanho-1];
		int temp = first;
		vet[0] = last;
		vet[tamanho-1] = temp;
		return vet;
	}
}
