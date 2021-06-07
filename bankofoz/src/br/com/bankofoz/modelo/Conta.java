package br.com.bankofoz.modelo;

/*
 * Polimorfismo:
 * É o pilar que admite um elemento ter o mesmo nome e executar várias ações distintas.
 * => Objeto
 * Quando fazendo uso da herança, criamos o objeto pelo pai e instanciamos pelo filho.
 * Exemplo:
 * Conta conta = new Corrente();
 * => Método
 * Dois tipos:
 * Overload (sobrecarga)=> quando os métodos estão na mesma classe (desacelerar() da classe Veiculo)
 * Override (sobrescrita) => quando os métodos estão em classes distintas (pai e filha) 
 * Exemplo: getResumo() => está na classe Conta, Corrente e na classe Poupanca 
 * 
 * 
 */

public class Conta {
	
	private int numero;
	private double saldo;
	private Cliente cliente;
	private Agencia agencia;
	
	
	public String getResumo() {
		return "Saldo: " + saldo +  "\n" + " Nome do cliente: " + cliente.getNome(); //get nome para pegar somente o nome do cleinte não a classe cliente toda.
	}
	
	public boolean depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}else {
			return false;
		}
		
	}
	
	public Conta() {
		super();
	}
	public Conta(int numero, double saldo, Cliente cliente, Agencia agencia) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.agencia = agencia;
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + ", agencia=" + agencia + "]";
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	


}
