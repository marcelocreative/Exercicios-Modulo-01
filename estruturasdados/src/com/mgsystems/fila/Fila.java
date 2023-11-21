package com.mgsystems.fila;

import com.mgsystems.listaligada.Elemento;
import com.mgsystems.listaligada.IteratorListaLigada;
import com.mgsystems.listaligada.ListaLigada;

public class Fila {
	
	ListaLigada lista;
	
	public Fila() {
		lista = new ListaLigada();
	}
	
	public void adicionar(Integer valor) {
		
		lista.adicionarNoFinal(valor);
		
	}
	
	public void remover() {
		
		if(lista.getTamanho()>0) {
			lista.removerPorValor(lista.getPrimeiro().getValor());
		}
		else {
			throw new RuntimeException("Fila está vazia");
		}
		
		
	}
	
	public Elemento getPrimeiroElemento(){
		
		return lista.getPrimeiro();
		
	}
	
	public Elemento getUltimoElemento(){
		
		return lista.getUltimo();
		
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
	
	public String imprimirFila(IteratorListaLigada iterator) {
		
		return lista.imprimeLista(iterator);
		
	}

}
