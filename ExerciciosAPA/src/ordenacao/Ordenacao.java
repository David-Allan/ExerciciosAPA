package ordenacao;
import ordena.Bolha;

import java.security.SecureRandom;

import item.Item;

public class Ordenacao {
	public static void main(String[] args){
		int i,n;
		Ordenacao o = new Ordenacao();
		Item[]itens = new Item[5];
		n = itens.length;
		SecureRandom random = new SecureRandom();
		for(i=0; i<n; i++){
			itens[i] = new Item(random.nextInt(100));
		}
		o.ordenaBolha(itens);
		
	}
	
	public void ordenaBolha(Item[] itens){
		Bolha bol = new Bolha(itens);
		System.out.println("Método da Bolha");
		System.out.println("Vetor desordenado");
		bol.imprime();
		System.out.println();
		bol.bolha();
		System.out.println("Vetor ordenado");
		bol.imprime();
	}
}
