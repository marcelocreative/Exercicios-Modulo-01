package com.mgsystems.fila;

import com.mgsystems.listaligada.IteratorListaLigada;

public class TesteFilaInteiros {
	
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.adicionar(1);
		fila.adicionar(2);
		fila.adicionar(3);
		fila.adicionar(4);
		fila.adicionar(5);
		fila.adicionar(6);
		
		if(fila.getTamanho()>0) {
			System.out.println("Último da fila: "+fila.getUltimoElemento().getValor());
			System.out.println("Primeiro da fila: "+fila.getPrimeiroElemento().getValor());
			System.out.println("Tamanho da fila: "+fila.getTamanho());
			System.out.println("Fila está vazia? "+fila.filaVazia());
			
			IteratorListaLigada iterator = fila.getIteraor();
			
			System.out.println(fila.imprimirFila(iterator));
		}
		else {
			System.out.println("Não há itens a serem exibidos");
		}
		
		System.out.println();
		
		fila.remover();
		fila.remover();
		fila.adicionar(7);
		
		if(fila.getTamanho()>0) {
			System.out.println("Último da fila: "+fila.getUltimoElemento().getValor());
			System.out.println("Primeiro da fila: "+fila.getPrimeiroElemento().getValor());
			System.out.println("Tamanho da fila: "+fila.getTamanho());
			System.out.println("Fila está vazia? "+fila.filaVazia());
			
			IteratorListaLigada iterator = fila.getIteraor();
			
			System.out.println(fila.imprimirFila(iterator));
		}
		else {
			System.out.println("Não há itens a serem exibidos");
		}
		
	}

}
