package com.mgsystems.listaligada;

public class ListaLigada {

	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	
	public ListaLigada() {
		this.tamanho = 0;
	}

	public Elemento getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	private void adicionarPrimeiroElemento(Integer valor) {
		
		Elemento novoElemento = criarElemento(valor);
		
		novoElemento.setProximo(ultimo);
		primeiro = novoElemento;
		ultimo = novoElemento;
		
	}
	
	public void adicionarPorPosicao(Integer posicao, Integer valor) {
		
		Elemento novoElemento = criarElemento(valor);
		Elemento elementoAux = primeiro;
		
		if(posicao == 0) {
			adicionarNoComeco(valor);
		}
		else if(posicao == tamanho) {
			adicionarNoFinal(valor);
		}
		else if(posicao < tamanho) {
			
			for(int i=0; i < posicao- 1; i++) {
				elementoAux = elementoAux.getProximo();
			}
			
			novoElemento.setProximo(elementoAux.getProximo());
			elementoAux.setProximo(novoElemento);
			elementoAux = novoElemento;
			
			tamanho ++;
			
		}
		else {
			
			throw new IndexOutOfBoundsException("Posição inválida");
			
		}
		
		
	}
	
	public void adicionarNoComeco(Integer valor) {
		
		Elemento novoElemento= criarElemento(valor);
		
		if(primeiro == null && ultimo==null) {
			adicionarPrimeiroElemento(valor);
		}
		else {
			novoElemento.setProximo(primeiro);
			primeiro = novoElemento;
		}
		
		tamanho++;
		
	}
	
	public void adicionarNoFinal(Integer valor) {
		
		Elemento novoElemento= criarElemento(valor);
		
		if(primeiro == null && ultimo==null) {
			adicionarPrimeiroElemento(valor);
		}
		
		else {
			ultimo.setProximo(novoElemento);
			ultimo= novoElemento;
			
		}
		
		tamanho++;
	}
	
	public Elemento removerDoFInal(){
		
		Elemento anterior = null;
		Elemento atual = primeiro;
		Elemento elementoRetorno= null;
		
		if(tamanho>0) {
			
			for(int i=0; i<tamanho; i++) {
				
				if(tamanho == 1) {
					elementoRetorno = atual;
					primeiro = null;
					ultimo = null;
				}
				else if(i == tamanho - 1) {
					elementoRetorno = ultimo;
					ultimo = anterior;
					anterior.setProximo(null);
					break;
				}
				
				anterior = atual;
				atual= atual.getProximo();
			}
			
		}
		
		tamanho--;
		return elementoRetorno;
	}
	
	public Elemento removerPorValor(Integer valor) {
		
		Elemento anterior = null;
		Elemento atual = primeiro;
		Elemento elementoRetorno= null;
		
		if(tamanho>0) {
			
			for(int i=0; i< tamanho; i++) {
				
				if(atual.getValor().equals(valor)) {
					elementoRetorno = atual;
					
					if(tamanho == 1) {
						primeiro = null;
						ultimo = null;
					}
					
					else if(atual == primeiro) {
						
						primeiro = atual.getProximo();
						atual.setProximo(null);
						
					}
					
					else if(atual == ultimo) {
						ultimo = anterior;
						anterior.setProximo(null);
					}
					else {
						anterior.setProximo(atual.getProximo());
						atual = null;
					}
					
					tamanho--;
					break;
					
				}
				
				anterior = atual;
				atual= atual.getProximo();
				
			}
			
		}
		
		else {
			throw new RuntimeException("Lista está vazia");
		}
		
		return elementoRetorno;
		
	}

	public void removerPorPosicao(Integer posicao) {
		
		if(tamanho>0) {
			
			if(posicao >= tamanho) {
				throw new IllegalArgumentException("A posição "+posicao+" é inválida");
			}
			else if(posicao == 0) {
				System.out.println("remover primeiro elemento");
				Elemento proximo = primeiro.getProximo();
				primeiro.setProximo(null);
				primeiro = proximo;
				
			}
			else if(posicao == tamanho-1) {
				System.out.println("remover último elemento");
				Elemento penaultimo = buscarPorPosicao(tamanho-2);
				penaultimo.setProximo(null);
				ultimo = penaultimo;
				
			}
			else {
				System.out.println("remover elemento do meio");
				Elemento anterior = buscarPorPosicao(posicao-1);
				Elemento proximo = buscarPorPosicao(posicao+1);
				Elemento atual = buscarPorPosicao(posicao);
				
				anterior.setProximo(proximo);
				atual.setProximo(null);
			}
			
			tamanho--;
			
		}
		
		else {
			throw new RuntimeException("Lista está vazia");
		}
		
	}
	
	public Elemento buscarPorPosicao(Integer posicao) {
		
		Elemento atual = primeiro;
		
		for(int i=0; i < posicao; i++) {
			
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			
		}
		
		return atual;
		
	}
	
	public Elemento buscarPorValor(Integer valor) {
		
		@SuppressWarnings("unused")
		Elemento anterior = null;
		Elemento atual = primeiro;
		Elemento elementoRetorno= null;
		
		if(tamanho>0) {
			
			for(int i=0; i< tamanho; i++) {
				
				if(atual.getValor().equals(valor)) {
					
					elementoRetorno = atual;
					break;
					
				}
				
				anterior = atual;
				atual= atual.getProximo();
				
			}
			
		}
		
		else {
			throw new RuntimeException("Lista está vazia");
		}
		
		return elementoRetorno;
		
	}
	
	public IteratorListaLigada getIteraor(){
		
		return new IteratorListaLigada(primeiro);
		
	}
	
	private Elemento criarElemento(Integer valor){
	
		return new Elemento(valor);
		
	}
	
	public String imprimeLista(IteratorListaLigada iterator) {
		
		StringBuilder builder= new StringBuilder();
		
		if(primeiro != null) {
			
			builder.append("["+primeiro.getValor());
				
			while(iterator.temProximo()) {
				builder.append(","+iterator.getProximo().getValor());
			}
			
			builder.append("]");
			
		}
		else {
			builder.append("[]");
		}
		
		return builder.toString();
	}

	
}
