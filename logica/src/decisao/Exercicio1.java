package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/*
		 * Exercicio 1:
		 * Solicite dois valores e um operador matematico
		 * (+, -, /ou *)
		 * Dependendo do operador que foi digitado realize o calculo
		 * e exiba o resultado.
		 * Dica: Se utilizar String a comparação de String deve ser:
		 * if ( variavel.equals("valorsercomparado")){}
		 * 
		 * 
		 */
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		String operador = JOptionPane.showInputDialog("Digite o operador matematico: ");
		
		if(operador.equals("+")) {
			System.out.println("resultado: " + (valor1 + valor2));
		}
		else if (operador.equals("-")) {
			System.out.println("resultado: " + (valor1 - valor2));
		}
		else if (operador.equals("/")) {
			System.out.println("resultado: " + (valor1 / valor2));
		}
		
		else if (operador.equals("*")) {
			System.out.println("resultado: " + (valor1 * valor2));
		}
		
		else {
			System.out.println("Operador Invalido.");
		}
	}
}
