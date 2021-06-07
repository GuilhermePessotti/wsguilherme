package br.com.bankofoz.modelo;

import br.com.bankofoz.interfaces.PadraoBanco;

public class Cliente implements PadraoBanco {
	
	private int id;
	private String nome;
	private String cpf;
	
	
	public Cliente() {
		super();
	}



	public Cliente(int id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	@Override
	public String get() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
