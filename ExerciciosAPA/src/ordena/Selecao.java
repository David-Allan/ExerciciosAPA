package ordena;
import item.Item;

public class Selecao extends Ordena {
	
	public Selecao(Item[]vetor){
		this.v = vetor;
	}
	
	public void selecao(){
		int i,j,menor,n=this.v.length;
		Item aux;
		
		for(i=0; i<n-1; i++){
			menor = i;
			for(j=i+1; j<n; j++){
				comparacoes++;
				if(this.v[j].chave < this.v[menor].chave){
					menor =j;
				}
			}
			aux = this.v[i];
			this.v[i] = this.v[menor];
			this.v[menor] = aux;
		}
	}
}
