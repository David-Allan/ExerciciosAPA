package ordena;
import item.Item;

public abstract class Ordena {
	Item[] v;
	int comparacoes;
	int trocas;
	
	public Item[] getVetor(){
		return v;
	}
	
	public void setVetor(Item[] vetor){
		this.v = vetor;
	}
	
	public int getComparacoes() {
		return comparacoes;
	}

	public void setComparacoes(int comparacoes) {
		this.comparacoes = comparacoes;
	}

	public int getTrocas() {
		return trocas;
	}

	public void setTrocas(int trocas) {
		this.trocas = trocas;
	}

	public void imprime(){
		int i,n = this.v.length;
		for(i = 0; i < n; i++){
			System.out.print(this.v[i].chave + " ");
		}
	}
}
