package com.mgsystems.pilha;

import com.mgsystems.listaligada.IteratorListaLigada;

public class TestePilhaInteiros {
	
	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.adicionar(6);
		pilha.adicionar(5);
		pilha.adicionar(4);
		pilha.adicionar(3);
		pilha.adicionar(2);
		pilha.adicionar(1);
		
		if(pilha.getTamanho()>0) {
			System.out.println("Topo da pilha: "+pilha.getElemento().getValor());
			IteratorListaLigada iterator = pilha.getIteraor();
			
			System.out.println(pilha.imprimirPilha(iterator));
		}
		else {
			System.out.println("Não há itens a serem exibidos");
		}
		
		System.out.println("Tamanho da pilha: "+pilha.getTamanho());
		System.out.println("Pilha está vazia? "+pilha.filaVazia());
		
		System.out.println();
		
		pilha.remover();
		pilha.remover();
		pilha.adicionar(7);
		pilha.remover();
		
		if(pilha.getTamanho()>0) {
			System.out.println("Topo da pilha: "+pilha.getElemento().getValor());
			IteratorListaLigada iterator = pilha.getIteraor();
			
			System.out.println(pilha.imprimirPilha(iterator));
		}
		else {
			System.out.println("Não há itens a serem exibidos");
		}
		
		System.out.println("Tamanho da pilha: "+pilha.getTamanho());
		System.out.println("Pilha está vazia? "+pilha.filaVazia());
		
	}

}
