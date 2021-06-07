package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {
	
	public static void main(String[] args) {
		/*
		 * Sobre o List
		 * - O tamanho é dinamico
		 * - Os dados podem ser heterogeneos (distintos)
		 * - Não necessita de variaval para controlar as posições (indices).
		 * - É possivel excluir uma posição.
		 * -Ordenação é simples
		 */
		List<String> lista = new ArrayList<String>(); //isto é uma lista Generics.
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("INFRA");
		//lista.add(true);
		//lista.add(500);
		//lista.add(500.5);
		
		System.out.println(lista);
		System.out.println("Primeiro elemento: " + lista.get(0));
		lista.remove(0);
		System.out.println("Depois de remover :" + lista);
		Collections.sort(lista); //classe ordenação de lista crescente.
		System.out.println("Ordenada: " + lista);
		
		
		for (int posicao=0; posicao<lista.size();posicao++) {
			System.out.println("Cargo: " +lista.get(posicao));
		}
		
	}

}
