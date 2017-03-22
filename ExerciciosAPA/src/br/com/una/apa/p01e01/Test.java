package br.com.una.apa.p01e01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe a letra do exercicio de 'A' ate 'C':");
		Scanner entrada = new Scanner(System.in);
		String opcao = entrada.next();
		System.out.println("Informe o valor do limite natural n:");
		int n = entrada.nextInt();
		Somatorio1 teste = new Somatorio1();
		teste.calculaSomatorio(opcao, n);
		entrada.close();
	}

}
