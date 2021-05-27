package br.com.caicaielavator.implementacao;

import br.com.caicaielavator.modelo.Elevador;

public class TesteElevador {
	
	public static void main(String[] args) {
		//1º instanciar o objeto
		Elevador elevador = new Elevador();
		
			
		elevador.preencherNome("TORRE B");
		elevador.inicializar(10, 0, 10);
		System.out.println("Retornar resumo Inicial :" + elevador.retornarResumo());
		elevador.subir();
		elevador.subir();
		System.out.println("Retornar resumo 2 :" + elevador.retornarResumo());
		elevador.subir();
		elevador.entrar(5);
		System.out.println("Retornar resumo 3 :" + elevador.retornarResumo());
		elevador.descer();
		elevador.sair();
		System.out.println("Retornar resumo 4 :" + elevador.retornarResumo());
		elevador.sair(15);
		System.out.println("Retornar resumo 5 :" + elevador.retornarResumo());
		
	}

}
