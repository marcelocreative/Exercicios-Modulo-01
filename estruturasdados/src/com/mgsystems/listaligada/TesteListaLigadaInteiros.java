package com.mgsystems.listaligada;

public class TesteListaLigadaInteiros {

	public static void main(String[] args) {
		
		ListaLigada lista= new ListaLigada();
		
	
		
		lista.adicionarNoFinal(3);
		//lista.adicionarNoFinal(2);
		lista.adicionarNoComeco(0);
		//lista.adicionarNoComeco(7);
		lista.adicionarPorPosicao(1, 10);
		lista.removerPorValor(10);
		lista.adicionarNoFinal(1);
		lista.adicionarPorPosicao(0, 1);
		lista.removerDoFInal();
		lista.removerPorPosicao(2);
		
		if(lista.getTamanho()>0) {
			System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
			System.out.println("Último: "+lista.getUltimo().getValor());
			System.out.println("Tamanho: "+lista.getTamanho());
			
			IteratorListaLigada iterator = lista.getIteraor();
			
			System.out.println(lista.imprimeLista(iterator));
		}
		else {
			System.out.println("Não há itens a serem exibidos");
		}
		
	}

}
