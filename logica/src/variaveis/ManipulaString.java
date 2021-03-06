package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		/*
		 * Identificadores ( nomes dos elementos que criamos: variaveis, classes,
		 * pacotes etc.
		 * -Regras: (obrigado a seguir caso contrario n?o vai funcionar)
		 * 1? - N?o come?ar?s com n?mero.
		 * 
		 * 2? - N?o utilizar? palavas reservadas. (palabras que fazem parte da limguagem de programa??o).
		 * 
		 * 3? - N?o faras uso de caracteres especiais.
		 * 
		 * -Padr?es: (n?o obrigado a seguir)
		 * 1? - CamelCase: Quando existir mais de uma palavra a segunda em diante deve come?ar com letra maiuscula.
		 * certo => dataNacimento
		 * errado => datanascimento
		 * certo => data_nascimento
		 * errado => data_Nascimento
		 * 
		 * 2? - UML: ? responsavel por padronizar elementos da Orienta??o a Objeto.
		 * -Toda classe deve come?ar com letra mai?scula
		 * -Toda variavel/pacote deve come?ar com letra min?scula
		 * -Todo m?todo deve come?ar com letra minuscula e deve ser seguido de parenteses.
		 * EX:
		 * xpto => ? uma vari?vel
		 * Xpto => ? uma classe
		 * xpto() => ? uma fun?ao
		 * Xpto.xpto() => ? um m?todo
		 * 
		 */

		String email = "guilherme.pessoTTI@itau-unibanco.com.br";
		
		
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Tem @ ? " + email.contains("@"));
		System.out.println("Qual a posi??o do @ ? " + email.indexOf("@"));
		System.out.println("Quantos caracters tenho no email ? " + email.length());
		System.out.println("Do 2? at? o quinto caracter: " + email.substring(1,5));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Usu?rio de email: " + email.substring(0, email.indexOf("@")).toLowerCase());
		System.out.println("Servidor de email: " + email.substring(email.indexOf("@") + 1, email.length()).toUpperCase());
		System.out.println("Primeiro caracter: " + email.toUpperCase().charAt(0)); //Char s? armazena 1 unico caracter.
		
		
	}
	
	

}
