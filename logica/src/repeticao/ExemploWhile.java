package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {
	
	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite o email").toUpperCase();
				
				while (email.contains("@")==false || email.indexOf("@")<2) {
					email = JOptionPane.showInputDialog("Digite o email nomavemnte").toUpperCase();
				}
				
				System.out.println("Usuário: " + email.substring(0, email.indexOf("@")));
				
				//o nome não pode ter menos que 3 caracter e mais que 20.
				String nome = JOptionPane.showInputDialog("Digite o nome: ").toUpperCase();
				
				while (nome.length() < 4 || nome.length() > 20) {
					nome = JOptionPane.showInputDialog("Favor digitar o nome maior que 3 caracter e menor que 20.").toUpperCase();
				}
				
				System.out.println("nome: " + nome);
	}

}
