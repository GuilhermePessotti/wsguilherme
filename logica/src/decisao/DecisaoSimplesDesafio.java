package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	
	public static void main(String[] args) {
		
		/*
		 * Capture o nome de uma pessoa e a idade
		 * De acordo com as leis eleitoriais apresente uma 
		 * das mensagens abaixo:
		 * = "Seu voto � obrigatorio"
		 * = "Seu voto � facultativo"
		 * - Voce n�o pode votar"
		 */
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		
		
		if (idade >= 18 && idade < 70) {
			System.out.println("Ol� " + nome + " voce � obrigado a votar pois !");
		}
		
		if (idade >= 16 && idade < 18 || idade >= 70) {
			System.out.println("Ol� " + nome + " seu voto � facultativo !");
		}
		
		if(idade < 16) {
			System.out.println("Ol� " + nome + " voce n�o pode votar !");
		}
			
	}

}
