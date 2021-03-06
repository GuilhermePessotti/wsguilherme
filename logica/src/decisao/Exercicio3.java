package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/*
		 * Exercicio 3:
		 * Receba o valor do sal?rio bruto, o nome de um colaborador e 
		 * a qtde de faltas.
		 * Se n?o houver faltas o salario bruto receber? um aumento de 2%.
		 * Calcule o valor do INSS sobre o sal?rio bruto.
		 * Exiba no final o sal?rio bruto, e o sal?rio liquido (retirando
		 * o INSS e 8% do FGTS)
		 * 
		 * 
			Sal?rio de contribui??o	Al?quota
				At? R$ 1.100	7,5%
				De R$ 1.100,01 a R$ 2.203,48	9%
				De R$ 2.203,49 at? R$ 3.305,22	12%
				De R$ 3.305,23 at? R$ 6.433,57	14%
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Nome: ").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Qual a quantidade de faltas: "));
		float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do salario: "));
		float inss=0;
		
		
		
		if (faltas == 0) {
			salarioBruto = salarioBruto + (salarioBruto * (float)0.02);
		}
		
		if (salarioBruto <= 1100 ) {
			inss = salarioBruto * (float) 0.07;
		} else if (salarioBruto > 1.100 && salarioBruto <= 2203.48 ){
			inss = salarioBruto * (float) 0.09;
		} else if (salarioBruto > 2203.49 && salarioBruto <= 3305.22) {
			inss = salarioBruto * (float) 0.12;
		}else {
			inss = salarioBruto * (float) 0.14;
		}
		
		System.out.println("Colaborador: " + nome);
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Salario Liquido: " + ( salarioBruto - inss - salarioBruto* 0.08));
		System.out.println("inss: " + inss);
	}
}
