package br.com.bankofoz.modelo;

//Cuidados no construtor cheio e no tostring.

public class Corrente extends Conta {
	
	private double limite;
	private double taxa;
	
	public String getResumo() {
		return "Taxa : " + taxa  + " \nLimite: " + limite + " \nSaldo da conta: " + super.getSaldo() + 
				"\nNome do Cliente: " + super.getCliente().getNome();
	}
	
	public double getSaldo() {
		return super.getSaldo() + limite;
	}
	
	
	public boolean sacar(double valor) {
		if(valor <= (super.getSaldo() + limite)) {
			super.setSaldo(super.getSaldo() - valor);
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public Corrente() {
		super();
	}

	public Corrente(int numero, double saldo, Cliente cliente, Agencia agencia, double limite, double taxa) {
		super(numero, saldo, cliente, agencia);
		this.limite = limite;
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", toString()=" + super.toString() + "]";
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	

}
