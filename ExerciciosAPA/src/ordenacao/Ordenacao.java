package ordenacao;
import ordena.Bolha;

import java.security.SecureRandom;

import item.Item;

public class Ordenacao {
	public static void main(String[] args){
		int i;
		Ordenacao o = new Ordenacao();
		Item[]itens = new Item[5];
		SecureRandom random = new SecureRandom();
		for(i=0; i<5; i++){
			itens[i] = new Item(random.nextInt(10));
		}
		o.ordenaBolha(itens);
		
	}
	
	public void ordenaBolha(Item[] itens){
		Bolha bol = new Bolha(itens);
		System.out.println("Método da Bolha");
		System.out.println("Vetor desordenado");
		bol.imprime();
		bol.bolha();
		System.out.println("Vetor ordenado");
		bol.imprime();
	}
}
