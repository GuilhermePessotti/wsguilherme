package repeticao;

import javax.swing.JOptionPane;

public class DesafioDO {

	public static void main(String[] args) {
		/*
		 * Miss?o1
		 * O jogador um digita um numero inteiro.
		 * A partir dai o jogador 2 deve advinhar o numero,
		 * somente quando ele acertar dever? aparecer a mensagem
		 * Parabens, voce acertou.
		 * )
		 * Miss?o 2
		 * Acrescente dicas para o jogador2, informando se o numero que ele tem 
		 * que adivinhar ? maior ou menor que o numero que ele esta digitando.
		 * 
		 * Miss?o3:
		 * Acrescente um contador de tentativas, que ser? exibido quando
		 * o jogador 2 acertar, a mensagem dever? ser:
		 * "parabens, voce acertou com X tentativas(s)".
		 * Dica ter?o que criar uma variavel para contar.
		 * 
		 */

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1: favor digitar o numero"));
		int numero2 = 0;
		int cont = 0;

		do {
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2: Adivinhe o numero."));
			cont = cont + 1;
			if(numero1 > numero2) {
				JOptionPane.showMessageDialog(null, "Jogador 2: Chutando baixo.");
			}else if (numero1 < numero2) {
				JOptionPane.showMessageDialog(null, "Jogador 2: Chutando alto.");
			}

		}while(numero1 != numero2);
		JOptionPane.showMessageDialog(null, "Parabens Voce acertou com " + cont + " tentativa(s)." );
	}


}


