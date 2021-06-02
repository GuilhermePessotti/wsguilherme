package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Venda;

public class TesteVendas2 {
	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				1,
				"02/06/2021",
				new Produto(
						1,
						"Churros",
						6,
						12,
						10
						),
				new Cliente(
						1,
						"Guilherme",
						"guilherme.pessotti@msn.com",
						"1234554321",
						new Endereco(
								"RUA",
								"45",
								"Viela 2",
								"Pimentas",
								"guarulhos",
								"SP",
								"123456"
								)
						),
				new Colaborador(
						10,
						"Vendedor Xpto",
						new Endereco(
								"RUA",
								"50",
								"Viela 1",
								"VilaGalvão",
								"guarulhos",
								"SP",
								"123456"
								),
						"Analista de TI",
						5000
						),
				new Pagamento(
						1,
						10000,
						"02/06/2021",
						"PIX"
						)
				);
		
		//System.out.println(venda.toString());
		System.out.println("Nome do Cliente: " + venda.getCliente().getNome());
		System.out.println("Cidade do cliente: " + venda.getCliente().getEndereco().getCidade());
		System.out.println("Nome do vendedor : " + venda.getVendedor().getNome());
		System.out.println("Descrição do Produto :" + venda.getProduto().getDescricao());
		System.out.println("Forma de Pagamento :" + venda.getPagamento().getForma());
	}
	
}
