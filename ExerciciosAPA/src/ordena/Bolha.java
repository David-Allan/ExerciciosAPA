package ordena;
import item.Item;

public class Bolha extends Ordena {
	public Bolha(){
		
	}
	
	public Bolha(Item[]vetor){
		this.v = vetor;
	}
	
	public void bolha(){
		int i,j, n = this.v.length;
		Item aux;
		
		for(i = 0; i<n-1; i++){
			for(j=1; j<n-1; j++){
				if(this.v[j].chave<this.v[j-1].chave){
					aux = this.v[j];
					this.v[j] = this.v[j-1];
					this.v[j-1]=aux;
				}
			}
		}
		
	}
}
