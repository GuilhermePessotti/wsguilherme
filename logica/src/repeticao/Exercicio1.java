package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		
		/*
		 * Exercicio 1
		 * Pe?a para o usu?rio digitar o valor da tabuada que ele deseja visualizar.
		 * monte o la?o para que apresente o resultado da tabuada, da seuinte forma:
		 * 
		 * numero X 0 = resultado
		 * numero X 1 = resultado
		 * numero X 100 = resultado
		 * 
		 * 
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero que deseja visualizar a tabuada: "));
		int mult = 0;
		int resultado = 0;
		
		while (mult <= 100) {
			resultado = (numero * mult);
			System.out.println(numero + " X " + mult + " = "+ resultado );
			mult = mult + 1 ;
		}
		
		
	}

}
