package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Exercicio 2:
		 * Considere receber a quantidade de diarias de um hotel e o valor
		 * da diaria. sobre a diaria haver� uma taxa que depende da quantidade di�ria.
		 * Se a quantidade de diarias for maior que 10 a taxa ser� de 5%.
		 * Se a quantidade de diarias estiver entre 5 e 10 a taxa ser� de 8 %
		 * se a quantidade de diarias for menor que 5 a taxa ser� de 10 %
		 * Exiba o valor final.
		 * 
		 * 
		 */
		
		float qtddiarias = Float.parseFloat(JOptionPane.showInputDialog("Digite q quantidade de di�rios: "));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da di�ria: "));
		float taxa=0;
		
		if(qtddiarias > 10) {
			taxa = valor * (float)0.05;
			System.out.println("O valor total a pagar � de R$:" + (valor + taxa) * qtddiarias);
		}
		
		else if (qtddiarias < 5) {
			System.out.println("O valor total a pagar � de R$:" + (valor + (valor * 0.10))* qtddiarias);
		}
		
		else if (qtddiarias >= 5 && qtddiarias <= 10) {
			System.out.println("O valor total a pagar � de R$:" + (valor + (valor * 0.08))* qtddiarias);
		}
	}
}
