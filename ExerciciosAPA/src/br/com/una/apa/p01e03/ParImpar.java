package br.com.una.apa.p01e03;

import java.security.SecureRandom;

public class ParImpar {
	
	public int[] createVector(){
		int vector[] = new int[10];
		SecureRandom random = new SecureRandom();
		for(int i = 0; i <10; i++){
			vector[i] = random.nextInt(100);
		}
		return vector;
	}
	
	public String isParImpar(int[]vet){
		String result = (vet[0] % 2 == 0) ? "PAR" : "IMPAR"; 
		return result;
	}
}
