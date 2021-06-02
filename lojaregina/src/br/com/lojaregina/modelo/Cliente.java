package br.com.lojaregina.modelo;

/*
 * Design Pattern: compilado de boas práticas para OO.
 * DTO (data Transfer Object) => é um pattern que indica as melhores práticas para
 * a montagem de uma classe modelo (do Diagrama de Classe) na programação.
 *  - TODOS os atibutos devem ser privados
 *  - Cada atributo deve possuir INDIVIDUAlMENTE um método de input e outro método de output. (getter setter)
 *  - Deve possuir dois construtores no mínimo, onde um deles deve estar vazio 9sem parametros) e 
 *  o outro deve estar completo com (todos os parametros para o preenchimento dos atributos.)
 *  
 *  modelo = beans = JavaBeans = dto = to
 */

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private Endereco endereco;
	
	
	//construtores
	
	public Cliente () {}
	
	public Cliente (int id, String nome, String email, String telefone, Endereco endereco) {
		this.id=id;
		this.nome=nome;
		this.email=email;
		this.telefone=telefone;
		this.endereco=endereco;
	}
	
	// <modificador> <tipo do retorno> <nome do método> (<tipo param> <nome do param> {
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getUsuario() {
		if (email.contains("@")==true) {
			return email.substring(0, email.indexOf("@"));
		}else {
			return email;
		}
	}
	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", endereco="
				+ endereco + "]";
	}

	public void setAll(Endereco endereco, int id, String nome, String email, String telefone) {
		this.endereco = endereco;
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
