package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	// main () � o start point de uma aplica��o java
	// � a chave de igni��o do carro
	public static void main(String[] args) {
		
		// Sintaxe: <Tipo de dado> <nome da variavel> = <dado>;
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome...: " + nome);
		System.out.println("Idade... : " + idade);
		System.out.println("Altura... :" + altura);
		System.out.println("IMC...: " +imc);
		
		
		/*
		 * Alfanum�rico:� um texto, parte de um texto ou um numero que n�o ser� utilizado
		 *em opera��es matematicas.
		 * Em javanes: "String" S maiusculo
		 * 
		 * Num�rico: representa um dado que PODE ser utilizado em express�es matem�ticas 
		 * e /ou � considerado um dado critico para o contexto.
		 * Em Javanes: 
		 * "int" para representa��o de n�meros inteiros
		 * "double" para numeros reais (com casas decimais)
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	// Em uma classe encontramos: m�todos e atributos
	// Nossa classe � publica
	/*
	 * JVM � o interpretador do Java
	 * JRE � o ambiente de execu��o
	 * JDk � o ambiente para desenvolvimento Java
	 * 
	 */
	
} // fechando o bloco da classe Tiposdados
