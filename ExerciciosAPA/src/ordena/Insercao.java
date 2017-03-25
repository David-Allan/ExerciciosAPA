package ordena;
import item.Item;

public class Insercao extends Ordena {
	public Insercao(Item[] vetor){
		this.v = vetor;
	}
	
	public void insercao(){
		int i,j,n = this.v.length;
		Item aux;
		
		for(i=1; i<n; i++){
			aux = this.v[i];
			for(j=i-1;(j>=0)&&(aux.chave<this.v[j].chave);j--){
				this.v[j+1] = this.v[j];
			}
			this.v[j+1] = aux;
		}
	}
}
