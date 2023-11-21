package com.mgsystems.pilha;

import com.mgsystems.listaligada.Elemento;
import com.mgsystems.listaligada.IteratorListaLigada;
import com.mgsystems.listaligada.ListaLigada;

public class Pilha {

	ListaLigada lista;
	
	public Pilha() {
		lista= new ListaLigada();
	}
	
	public Elemento getElemento(){
		
		return lista.getPrimeiro();
		
	}
	
	public void adicionar(Integer valor) {
		
		lista.adicionarNoComeco(valor);
		
	}
	
	public Elemento remover(){
		
		if(lista.getTamanho()>0) {
			return lista.removerPorValor(getElemento().getValor());
		}
		else {
			throw new RuntimeException("Pilha está vazia");
		}
		
	}
	
	public int getTamanho() {
		return lista.getTamanho();
	}
	
	public Boolean filaVazia() {
		
		if(lista.getTamanho() < 1) {
			return true;
		}
		
		return false;
	}
	
	public IteratorListaLigada getIteraor(){
		
		return lista.getIteraor();
		
	}
	
	public String imprimirPilha(IteratorListaLigada iterator) {
		
		return lista.imprimeLista(iterator);
		
	}
	
}
