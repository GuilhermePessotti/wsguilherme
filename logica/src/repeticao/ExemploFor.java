package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	
	public static void main(String[] args) {
		
		/*
		 * Sintaxe do for:
		 * 
		 * 1- variavel que vai contas
		 * 2- condição
		 * 3- como ele vai contar?
		 * 
		 */
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		for (int contador = 0; contador < 11; contador+=1 ){
			System.out.println(tabuada + " X "  + contador + " = " + (tabuada * contador));
		}
		
	}

}
