package br.com.una.apa.p01e05;

public class QuantidadeNIP {
	public String quantidadeNIP(int[]vet){
		int countImpar = 0;
		int countPar = 0;
		String result;
		
		for(int i = 0; i<= vet.length -1; i++){
			if(vet[i] % 2 == 0){
				countPar++;
			}
			else {
				countImpar++;
			}
		}
		return result = "Numeros Pares: " + countPar + "\nNumeros Impares: " + countImpar;
		
	}
}
