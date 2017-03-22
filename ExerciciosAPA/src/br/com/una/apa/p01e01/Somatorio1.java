package br.com.una.apa.p01e01;

public class Somatorio1 {
	public  void calculaSomatorio(String opcao, int n){
		
		switch (opcao) {
		case "a":
			int total = 0;
			for (int  i = 0; i <= n; i++){
				System.out.print(i + " + ");
				total += i;
			};
			System.out.print("\nResultado Somatorio: " + total);
			break;
			
		case "b":
			total = 0;
			for (int  i = 0; i <= n; i++){
				System.out.print("(" + i + " + 5 ) + ");
				total += (i+5);
			};
			System.out.println("\nResultado Somatorio: " + total);
			break;
			
		case "c":
			total = 0;
			for (int  i = 2; i <= n; i++){
				System.out.print("(" + i + "-3²/(" + i +"-1)"+") + ");
				total += (Math.pow(i-3, 2)/(i-1));
			};
			System.out.println("\nResultado do Somatorio: " + total);
			break;
			
		default:
			break;
		}
	}
}
