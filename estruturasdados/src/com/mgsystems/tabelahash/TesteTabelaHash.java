package com.mgsystems.tabelahash;

public class TesteTabelaHash {

	public static void main(String[] args) {
		
		TabelaHash tabelaHash= new TabelaHash();

		//adicionar o mesmo valor para o valor e chave
		tabelaHash.adicionar(1100, 1100);
		tabelaHash.adicionar(20, 20);
		tabelaHash.adicionar(888, 888);
		tabelaHash.adicionar(200, 200);
		tabelaHash.adicionar(222, 222);
		
		System.out.println("Impress�o dos intens da tabela hash");
		tabelaHash.imprimir();
		
		System.out.println();
		//Adicionar o valor para o campo chave que a fun��o hash far� a sua cri��o usando o valor
		System.out.println("Itens removidos da tabela hash");
		tabelaHash.remover(200);
		
		System.out.println();
		System.out.println("Impress�o dos intens da tabela hash");
		tabelaHash.imprimir();
		
		//Adicionar o valor para o campo chave que a fun��o hash far� a sua cri��o usando o valor
		System.out.println();
		System.out.println("Impress�o dos intens da tabela hash");
		
		System.out.println("Chave: "+tabelaHash.funcaoHash(1100));
		System.out.println("Valor: "+tabelaHash.buscar(1100).getValor());
		
		tabelaHash.limpar();
		System.out.println();
		System.out.println("Impress�o da tabela hash ap�s limpeza");
		tabelaHash.imprimir();
	}

}
