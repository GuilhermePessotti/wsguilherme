package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
	/*
	 * Tipos Primitivos (TODOS aqueles que come�am com letra minuscula)
	 * boolean => L�gico (True/False)
	 * char => um caracter entre apostrofos ''
	 * 
	 * byte => -128/+127
	 * short => -32 mil / + 32 mil
	 * int => -2 trilhoes / + 2 trilhoes
	 * long => (-) 9 quintilhoes (+) 9 quintilhoes
	 * 
	 * float => at� 5 casas decimais
	 * double => acima do float
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Capturem:
		 * Nome do produto
		 * qte do produto
		 * valor unitario
		 * 
		 * exibir no final:
		 * nome do produto
		 * valor total
		 * valor do imposto (17% sobre o valor total
		 */
		
		String Produto = JOptionPane.showInputDialog("Digite o nome do produto: ");
		int qtdproduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto: "));
		float valorunitario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
		float valortotal = qtdproduto * valorunitario;
		float imposto = valortotal * (float) 0.17; // cast => casting (ajuste de tamanho)
		
		System.out.println("Nome do Produto: " + Produto);
		System.out.println("Valor total do Produto informado " + valortotal);
		//System.out.println("Valor do imposto do produto " + (valortotal * 0.17));
		System.out.println("Valor do imposto do produto " + (imposto));
		
		
			
		
	}

}
