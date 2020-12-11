package code;


public class Valores implements ValoresITF{
	
	int tamanhoMax = 10;
	int [] listaDeValores = new int[tamanhoMax];
	
	public boolean ins(int v) {
		if(v > 0) {
			for(int i=0; i < this.listaDeValores.length; i++) {
				if(listaDeValores[i] == 0) {
					this.listaDeValores[i] = v;
					return true;	
					}				
		 		}
			}
			return false;
		}

	public int del(int i) {
		int aux = 0;
		boolean contemElementos = false;
		
		for(int a =0; a < listaDeValores.length; a++ ) {
			if(listaDeValores[i] != 0) {
				contemElementos = true;
			}
		} if (contemElementos) {
			if(i >= 0 && i <=9) {
				aux = listaDeValores[i];
				listaDeValores[i] = 0;
			} return aux;
		}else {
			return -1;
		}
		
	
	
	}
			
	public int size() {
		int tamanho = 0;
		for(int i = 0; i < listaDeValores.length; i++) {
			if(listaDeValores[i] != 0) {
				tamanho = tamanho +1;
			}
		}
		return tamanho;
	}

	

}
