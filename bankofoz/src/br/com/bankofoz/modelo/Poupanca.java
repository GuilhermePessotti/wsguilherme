package br.com.bankofoz.modelo;

public class Poupanca extends Conta {
	
	private double rendimento;
	private int aniversario;
	
	
	public String getResumo() {
		return "Aniversario: " + aniversario + " Saldo : " + super.getSaldo() + " Nome do Cliente : " 
				+ super.getCliente().getNome() + " Nome da Agencia: " + super.getAgencia().getNome();
	}
	
	
	public Poupanca() {
		super();
	}


	public Poupanca(int numero, double saldo, Cliente cliente, Agencia agencia, double rendimento, int aniversario) {
		super(numero, saldo, cliente, agencia);
		this.rendimento = rendimento;
		this.aniversario = aniversario;
	}


	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", aniversario=" + aniversario + ", toString()="
				+ super.toString() + "]";
	}
	
	
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public int getAniversario() {
		return aniversario;
	}
	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	
	

}
