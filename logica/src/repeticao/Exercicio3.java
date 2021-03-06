package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Exercicio 3 Solicite ao usu?rio (enquanto ele quiser), o cargo e o salario do
		 * cargo. No final exiba: - total de todos os salarios - m?dia - o maior valor
		 * entre todos os sal?rios que foram digitados, com o cargo.
		 * 
		 * 
		 */
		String cargo = "";
		float salario = 0;
		float total = 0;
		int cont = 0;
		float qtdeSalarios = 0;
		float maiorSalario = 0;
		String maiorCargo ="";

		if (JOptionPane.showConfirmDialog(null, "Deseja informar o cargo e salario ? ", "Titulo",
				JOptionPane.YES_NO_OPTION) == 0) {

			do {
				cont = cont + 1;
				qtdeSalarios = qtdeSalarios + 1;
				cargo = JOptionPane.showInputDialog("Digite o cargo: ").toUpperCase();
				salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario: "));
				System.out.println("Cargo: " + cargo + " com salario: " + salario + " adicionados.");
				total = total + salario;
				if (salario > maiorSalario) {
					maiorSalario = salario;
					maiorCargo = cargo;
				}
			} while (JOptionPane.showConfirmDialog(null, "Deseja informar um novo cargo ?", "Titulo",
					JOptionPane.YES_NO_OPTION) == 0);

			System.out.println("Total de salarios informado(s): " + total);
			System.out.println("Media: " + total / qtdeSalarios);
			System.out.println("Maior salario informado: " + maiorSalario + " com o cargo: " + maiorCargo);

		}

		else {
			System.out.println("Nenhum produto aidionado a compra.");
		}

	}

}
