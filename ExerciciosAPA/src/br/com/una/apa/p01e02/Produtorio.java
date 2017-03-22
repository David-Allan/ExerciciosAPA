package br.com.una.apa.p01e02;

public class Produtorio {
	
public  void calculaProdutorio(String opcao, int n){
		
		switch (opcao) {
		case "a":
			int total = 0;
			for (int  i = 0; i <= n; i++){
				System.out.print(i + " * ");
				total *= i;
			};
			System.out.print("\nResultado Somatorio: " + total);
			break;
		case "b":
			for (int  i = 0; i <= n; i++){
				System.out.println(i+5);
			};
			break;
		case "c":
			for (int  i = 2; i <= n; i++){
				System.out.println(Math.pow(i, 2)/(i-1));
			};
		default:
			break;
		}
	}

}
