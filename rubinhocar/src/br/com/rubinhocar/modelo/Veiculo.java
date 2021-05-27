package br.com.rubinhocar.modelo;

public class Veiculo {

	private String modelo;
	private double valor;
	private int velocidadeAtual;
	private boolean status;
	// <modificador> <tipo do retorno> <nome do metodo> (tipo do parametro> <nome do parametro>,.....){
	
	
	public void preencherModelo(String param) {
		if (param.length() <10) {
		modelo = param.toUpperCase();
	}
	
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherValor(double param ) {
		if (param > 0) {
		valor = param;
		}
	}
	
	public double retornarValor() {
		return valor;
	}
	
	public String ligar() {
		status = true;
		return "ligado";
	}
	
	public String desligar() {
		velocidadeAtual = 0;
		status = false;
		return "desligado";
	}
	
	public void acelerar(int param) {
		if (status == true) {
			velocidadeAtual += param;
		}
	}
	
	public void desacelerar(int param) {
		if (status == true) {
			velocidadeAtual -= param;
		}
	}
	
	public void desacelerar() {
		velocidadeAtual=0;
	}
	
	public String retornarTudo() {
		String xpto = "NÃO";
				if (status ==true) {
					xpto = "SIM";
				}
		return 
				"Modelo........: "+ modelo + "\n" +
				"valor.........: "+ valor + "\n" +
				"Valocidade....: "+ velocidadeAtual + "\n" +
				"Ligado?.......: " + xpto ;
				//("Modelo: " + modelo + " Valor: " + valor + " VelocidadeAtual : " + velocidadeAtual + " Ligado : " + status);
	}
	
}
