package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Venda;

public class TesteVenda {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Produto produto = new Produto();
		Endereco endereco = new Endereco();
		Pagamento pagamento = new Pagamento();
		Venda venda = new Venda();
		Colaborador colaborador = new Colaborador();
		
		//Classe cliente
		cliente.setAll(endereco, 1, "Guilherme", "guilherme.pessotti@itau-unibanco.com.br", "11985985324");
		
		//Classe endereco
		endereco.setLogradouro("Rua X");
		endereco.setNumero("50");
		endereco.setComplemento(" ");
		endereco.setBairro("Centro");
		endereco.setCidade("São Paulio");
		endereco.setUf("SP");
		endereco.setCep("12345-123");
		
		//Classe colaborador
		colaborador.setEndereco(endereco);
		colaborador.setCargo("Analista de TI");
		colaborador.setId(1);
		colaborador.setNome("Gustavo");
		colaborador.setSalario(10000);
		
		//Classe pagamento
		pagamento.setId(1);
		pagamento.setValor(200);
		pagamento.setData("02/06/2021");
		pagamento.setForma("Pix");
		
		//Classe produto
		produto.setAll(1, "Churros", 100, 150, 10);
		
		//Classe venda
		venda.setId(1);
		venda.setCliente(cliente);
		venda.setData("02/06/2021");
		venda.setProduto(produto);
		venda.setVendedor(colaborador);
		venda.setPagamento(pagamento);
		
		
		System.out.println("Nome do Cliente: " + venda.getCliente().getNome());
		System.out.println("Cidade do cliente: " + venda.getCliente().getEndereco().getCidade());
		System.out.println("Nome do vendedor : " + venda.getVendedor().getNome());
		System.out.println("Descrição do Produto :" + venda.getProduto().getDescricao());
		System.out.println("Forma de Pagamento :" + venda.getPagamento().getForma());
		
	}

}
