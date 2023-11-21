package com.mgsystems.tabelahash;

import com.mgsystems.listaligada.Elemento;
import com.mgsystems.listaligada.IteratorListaLigada;
import com.mgsystems.listaligada.ListaLigada;

public class TabelaHash {
	
	ListaLigada[] vetor;
	
	public TabelaHash() {
		vetor= new ListaLigada[10];
		inicializarVetor();
	}
	
	private void inicializarVetor() {
		
		for(int i=0; i< vetor.length; i++) {
			vetor[i]= new ListaLigada();
		}
		
	}
	
	public int funcaoHash(Integer valor) {
		
		return Integer.toString(valor).charAt(0)-48;
		
	}
	
	public void adicionar(Integer chave, Integer valor) {
		
		vetor[funcaoHash(chave)].adicionarNoComeco(valor);
		
	}
	
	public void remover(Integer valor) {
		
		vetor[funcaoHash(valor)].removerPorValor(valor);
		
	}
	
	public Elemento buscar(Integer valor) {
		
		return vetor[funcaoHash(valor)].buscarPorValor(valor);
		
	}

	public void limpar() {
		
		for(int i=0; i< vetor.length; i++) {
			
			if(vetor[i].getPrimeiro() != null) {
				vetor[i].getPrimeiro().setProximo(null);
				vetor[i].setPrimeiro(null);
				vetor[i].setUltimo(null);
				vetor[i].setTamanho(0);
			}
			
		}
		
	}
	
	public void imprimir() {
		
		for(int i=0; i< vetor.length; i++) {
			
			if(vetor[i] != null) {
				
				IteratorListaLigada iterator = vetor[i].getIteraor();
				
				System.out.println(vetor[i].imprimeLista(iterator));
				
			}
			else {
				System.out.println("Não há itens a serem exibidos");
			}
		}
	}
}
