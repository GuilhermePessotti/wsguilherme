package br.com.caicaielavator.modelo;

public class Elevador {

	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private int andarAtual;

	public String retornarNome() {
		return nome;
	}

	public void preencherNome(String param) {
		if(param.length() > 0) {
			nome = param;
		}
	}

	public void inicializar(int pAndarMax, int pAndarMin, int pCapPessoas) {
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapPessoas;
	}

	public String retornarResumo() {
		return " Nome do elevador.: " + nome + "\n" +
				"Andar Atual: ....: " + andarAtual + "\n" +
				"Qtde de Pessoas..: " + qtdePessoas;
	}

	public String subir() {
		if (andarAtual < andarMaximo) {
			andarAtual = andarAtual + 1;
			return "Subindo";
		}else {
			return "Ja esta no ultimo andar.";
		}

	}

	public String descer() {
		if (andarAtual >= andarMinimo) {
			andarAtual = andarAtual -1;
			return "Descendo";
		}
		return "Ja esta no andar minimo.";

	}

	public void sair() {
		if(qtdePessoas > 0 ) {
			qtdePessoas = qtdePessoas - 1;
		}
	}

	public void entrar(int qtde) {
		if ((qtde + qtdePessoas) <= capacidadePessoas ) {
			qtdePessoas = qtdePessoas + qtde;
		}
	}

	public void sair(int qtde) {
		if ((qtdePessoas - qtde) > 0 ) {
			qtdePessoas = qtdePessoas - qtde;
		}
	}

}



