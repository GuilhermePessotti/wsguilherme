package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Produto;

public class TesteProduto {
	public static void main(String[] args) {
		
		Produto objeto = new Produto();
		
		 objeto.setAll(100, "CHURROS", 5, 10, 50);
		 System.out.println("Primeiros Valores" + objeto.toString());
		 System.out.println("10 % desconto: " + objeto.getDesconto());
		 System.out.println("50 % desconto: " + objeto.getDesconto(50));
		 System.out.println("Total venda: " + objeto.getTotalVenda());
		 System.out.println("Estoque: " + objeto.getVerificaEstoque());
		 objeto.setAtualizavalores(100);
		 System.out.println("Apos o aumento: " + objeto.toString());
	}

}
