package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {


		/*
		 * Exercicio 2
		 * Solicite o nome do cliente e o email, pergunte a ele se deseja adicionar
		 * itens para sua compra, e enquanto ele responder que sim, pe�a:
		 * nome do produto,valor e qtde.
		 * Exiba para cada produto o total de cada um.
		 * Quando terminar de adicionar produtos exiba no final o total da conta.
		 * 
		 */

		String nome = JOptionPane.showInputDialog("Digite o nome: ").toUpperCase();
		String email = JOptionPane.showInputDialog("Digite o email: ").toUpperCase();
		String produto = "";
		float valor = 0;
		int qtde = 0;
		float totalCompra = 0;
		float totalProduto = 0;

		do {

			produto = JOptionPane.showInputDialog("Nome do produto: ");
			valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do produto: "));
			qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto: "));
			totalProduto = valor * qtde;
			totalCompra = totalCompra + totalProduto;
			System.out.println("O total do produto "+ produto + " � :" + totalProduto);

		}while(JOptionPane.showConfirmDialog
				(null,"Deseja adicionar mais produtos a compra ?", "Titulo", JOptionPane.YES_NO_OPTION)==0);

		System.out.println("Ol� " + nome + " o total do seu pedido �: " + totalCompra + ", estamos enviando a NF ao email: "+ email + " !!"  );
	}

}
