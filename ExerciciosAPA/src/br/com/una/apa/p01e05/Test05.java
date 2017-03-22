package br.com.una.apa.p01e05;

import br.com.una.apa.p01e03.ParImpar;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParImpar parImpar = new ParImpar();
		int vet[] = parImpar.createVector();
		
		System.out.println("VETOR:");
		for(int vets : vet){
			System.out.print(vets + " ");
		}
		
		QuantidadeNIP nip = new QuantidadeNIP();
		System.out.println("\n" + nip.quantidadeNIP(vet));
	}

}
