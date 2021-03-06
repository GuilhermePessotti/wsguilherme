package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		/*
		 * Capture separadamente: dia, mes e ano
		 * 
		 * Para o dia somente ser? aceito a qtde de dias
		 * de acordo com o mes ( considere fevereiro somente com 29)
		 * 
		 * para o mes aceite somente valores entre 1 e 12
		 * 
		 * Para o ano aceite somente valores entre 2003 e 1920
		 * exiba a data comple no final
		 * 
		 */
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
		while(ano < 1920 || ano > 2003) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("O ano deve ser entre 2003 e 1920:"));
			
		}
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes:"));
		while (mes < 1 || mes > 12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes novamente entre 1 e 12:"));
		}
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
		if (mes == 02) {
			while (dia < 1 ||dia > 29) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia novamente entre 1 e 29:"));
			}
		}
		
		else if  (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			while (dia < 1 || dia > 30) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia novamente entre 1 e 30:"));
			}
		}
		
		while (dia <1 || dia > 31) {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia novamente entre 1 e 31:"));
		}
		
		System.out.println("a data digitada foi: " + dia +"/" + mes +"/" + ano);
	}

}
