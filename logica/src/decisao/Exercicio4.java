package decisao;

import javax.swing.JOptionPane;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		/*
		 * Exercicio 4:
		 * Receba tr�s n�meros inteiros e coloque-os em ordem num�rica
		 * crescente. Garanta que os tr�s n�meros sejam diferentes.
		 * 
		 */
		
		int valor1 =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor1: "));
		int valor2 =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor2: "));
		int valor3 =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor3: "));
		
		if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
			System.out.println("Numeros iguais, favor digitar numeros diferentes");
		}
		
		else {
			if(valor1 < valor2 && valor1 < valor3 ) {
				System.out.println(valor1);
				// 2 ou 3
				if(valor2 < valor3) {
					System.out.println(valor2);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor2);
				}
				
			}else if (valor2 < valor1 && valor2 < valor3 ) {
				System.out.println(valor2);
				// 1 ou 3
				if(valor1 < valor3) {
					System.out.println(valor1);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor1);
				}
			}else {
				System.out.println(valor3);
				//1 ou 2
				if(valor1 < valor2) {
					System.out.println(valor1);
					System.out.println(valor2);
				}else {
					System.out.println(valor2);
					System.out.println(valor3);
				}
			}
		}
	}
}
