package br.com.una.apa.p01e03;

public class TestApa03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParImpar parImpar = new ParImpar();
		int vet[]=parImpar.createVector();
		System.out.println("Primeira posição do Vetor: " + parImpar.isParImpar(vet));
		System.out.println("\n " + vet[0]);
	}

}
