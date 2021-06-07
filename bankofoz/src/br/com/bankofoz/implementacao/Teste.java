package br.com.bankofoz.implementacao;

import br.com.bankofoz.modelo.Agencia;
import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Poupanca;
import util.Magica;

public class Teste {
	
	public static void main(String[] args) {
		
		int opcao = Magica.i("Digite 1 para Conta Poupança e 2 para Conta Corrente.");
		while (opcao != 1 && opcao != 2) {
			opcao = Magica.i("Digite 1 para Conta Poupança e 2 para Conta Corrente.");
		}
		
		Conta conta = new Conta();
		//Corrente corrente = new Corrente();
		

		
		if(opcao == 1) {
			conta = new Poupanca(
					Magica.i("Numero da conta"),
					Magica.d("Saldo"),
					new Cliente(
							Magica.i("ID do Cliente"),
							Magica.s("Nome Do cliente"),
							Magica.s("CPF")
							),
					new Agencia(
							Magica.i("Agencia"),
							Magica.s("Nome da Agencia"),
							Magica.s("Telefone da Agencia")
							),
					Magica.d("Rendimentos da poupança"),
					Magica.i("Aniversario da poupança")
					);
			
		}else {
			conta = new Corrente(
					Magica.i("Numero da conta"),
					Magica.d("Saldo"),
					new Cliente(
							Magica.i("ID do Cliente"),
							Magica.s("Nome Do cliente"),
							Magica.s("CPF")
							),
					new Agencia(
							Magica.i("Agencia"),
							Magica.s("Nome da Agencia"),
							Magica.s("Telefone da Agencia")
							),
					Magica.d("Limite"),
					Magica.d("Taxa")
					);
			
		}
		
		
		System.out.println("Resumo Preenchimento : " + conta.toString());
		System.out.println("Depositando -10 : " + conta.depositar(-10));
		System.out.println("Sacando 300: " + conta.sacar(300));
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("resumo: " + conta.getResumo());
		System.out.println("resumo da conta: " + conta.getResumo());
		System.out.println("Sacando 300: " + conta.sacar(300)); 
		//sacar herda o metodo da classe super caso não tenha o sacar na classe filtro 
		//que é o caso da corrente.
		
	}

}
