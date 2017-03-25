package ordenacao;
import ordena.*;

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
		//o.ordenaBolha(itens);
		//o.ordenaSelecao(itens);
		//o.ordenaInsercao(itens);
		o.ordenaQuickSort(itens);
	}
	
	public void ordenaBolha(Item[] itens){
		Bolha bol = new Bolha(itens);
		System.out.println("Metodo da Bolha");
		System.out.println("Vetor desordenado");
		bol.imprime();
		System.out.println();
		bol.bolha();
		System.out.println("Vetor ordenado");
		bol.imprime();
	}
	
	public void ordenaSelecao(Item[] itens){
		Selecao sel = new Selecao(itens);
		System.out.println("Metodo de Selecao");
		System.out.println("Vetor desordenado");
		sel.imprime();
		System.out.println();
		sel.selecao();
		System.out.println("Vetor ordenado");
		sel.imprime();
		System.out.println("Comparacoes: " + sel.getComparacoes());
		System.out.println("Trocas: " + sel.getTrocas());
	}
	
	public void ordenaInsercao(Item[] itens){
		Insercao ins = new Insercao(itens);
		System.out.println("Metodo de Insercao");
		System.out.println("vetor desordenado");
		ins.imprime();
		System.out.println();
		ins.insercao();
		System.out.println("Vetor ordenado");
		ins.imprime();
	}
	
	public void ordenaQuickSort(Item[] itens){
		QuickSort qks = new QuickSort(itens);
		System.out.println("Metodo Quick Sort");
		System.out.println("Vetor desordenado");
		qks.imprime();
		System.out.println();
		qks.quickSort();
		System.out.println("Vetor ordenado");
		qks.imprime();
	}
}
