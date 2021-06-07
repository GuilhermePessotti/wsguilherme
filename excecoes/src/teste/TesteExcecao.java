package teste;

import excecao.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {

		try {
			int numero = Integer.parseInt("7");
			System.out.println("Valor: " + numero);
			
			String palavra = "";
			System.out.println("Qtde de letras: " + palavra.length());
			
			/*
			 * Caracteristicas do vetor
			 * - o tamanho dele � estatico
			 * - ovetor precisa de uma variavel para controlar o indice (posi��o)
			 * - os dados s�o homogeneos (do mesmo tipo)
			 * - N�o � possivel excluir uma posi��o em tempo de execu��o
			 * - ordena��o dos dados � complexa
			 */
			
			int numeros[] = new int[5]; //vetor.
			numeros [0] = 542;
			numeros [1] = 100;
			numeros [2] = 12;
			numeros [3] = 18;
			System.out.println(numeros[1]);
			
			for (int posicao=0; posicao<numeros.length;posicao++) {
				System.out.println("valor: " + numeros[posicao]);
			}
			
		
			
		}catch(Exception e) {
			
			System.out.println(MinhaExcecao.tratar(e));
			
		}


	}

}
