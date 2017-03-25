package ordena;

import item.Item;

public class QuickSort extends Ordena{
	public int i,j;
	
	public QuickSort(){
		
	}
	
	public QuickSort(Item[] vetor){
		this.v = vetor;
	}
	
	public void quickSort(){
		this.ordena(0, this.v.length - 1);
	}
	
	public void ordena(int e, int d){
		this.particao(e, d);
		if(e < this.j){
			this.ordena(e, this.j);
		}
		if(this.i<d){
			this.ordena(this.i,d);
		}
	}
	
	public void particao(int e, int d){
		Item x, aux;
		this.i = e;
		this.j = d;
		x = this.v[(this.i+this.j)/2];
		
		do{
			while(this.v[this.i].chave < x.chave){
				this.i++;
			}
			while(this.v[this.j].chave > x.chave){
				this.j--;
			}
			if(this.i<=this.j){
				aux = this.v[this.i];
				this.v[this.i] = this.v[this.j];
				this.v[this.j] = aux;
				
				this.i++;
				this.j--;
			}
		}
		while(this.i <= this.j);
	}
}
