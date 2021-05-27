package br.com.rubinhocar.implementacao;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {
	
	public static void main(String[] args) {
		//1� instanciar o objeto
		Veiculo objeto = new Veiculo(); //instancia um objeto.
		
		//2� Preencher os atributos do objeto
		objeto.preencherModelo("Camado");
		objeto.preencherValor(100000);
		
		// 3� Exibir os resultados
		System.out.println("Velocidade: " + objeto.retornarTudo());
		objeto.ligar();
		objeto.acelerar(100);
		objeto.desacelerar(30);
		System.out.println("Depois de ligar: \n" + objeto.retornarTudo());
		objeto.desligar();
		System.out.println("Depois de desligar: \n" + objeto.retornarTudo());
		
	}

}
