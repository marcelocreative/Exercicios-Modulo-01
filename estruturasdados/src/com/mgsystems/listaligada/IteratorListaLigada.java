package com.mgsystems.listaligada;

public class IteratorListaLigada {

	private Elemento elemento; 
	
	public IteratorListaLigada(Elemento elemento) {
		
		this.elemento = elemento;
		
	}
	
	public boolean temProximo() {
		
		if(elemento.getProximo() == null) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public Elemento getProximo(){
		
		elemento= elemento.getProximo();
		
		return elemento;
	}
}
