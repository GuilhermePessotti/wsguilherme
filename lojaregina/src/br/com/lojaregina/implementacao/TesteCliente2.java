package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Endereco;

public class TesteCliente2 {
	public static void main(String[] args) {
		
		Cliente objeto = new Cliente();
		
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro("Rua X");
		endereco.setNumero("50");
		endereco.setComplemento(" ");
		endereco.setBairro("Centro");
		endereco.setCidade("São Paulio");
		endereco.setUf("SP");
		endereco.setCep("12345-123");
		
		
		objeto.setAll(endereco, 1, "Xpto", "Xpto@xpto.com.br", "12344321");
		
		
		System.out.println(objeto.toString());
		System.out.println("Bairro: " + objeto.getEndereco().getBairro());
		System.out.println("usuário: " + objeto.getUsuario());
	}

}
