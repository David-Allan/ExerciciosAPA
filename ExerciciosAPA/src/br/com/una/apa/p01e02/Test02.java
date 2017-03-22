package br.com.una.apa.p01e02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PRODUTORIOS\nInforme a letra do exercicio de 'A' ate 'C':");
		Scanner entrada = new Scanner(System.in);
		String opcao = entrada.next();
		System.out.println("Informe o valor do limite natural n:");
		int n = entrada.nextInt();
		Produtorio produtorio = new Produtorio();
		produtorio.calculaProdutorio(opcao, n);
		entrada.close();

	}

}
