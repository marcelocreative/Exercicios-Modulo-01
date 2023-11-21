package com.mgsystems.listaligada;

public class Elemento {

	private Integer valor;
	private Elemento proximo;
	
	public Elemento(Integer valor) {
		this.valor = valor;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	
}
