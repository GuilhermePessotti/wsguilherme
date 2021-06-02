package br.com.lojaregina.modelo;

public class Produto {

	private int id;
	private String descricao;
	private double valorCompra;
	private double valorVenda;
	private int qtde;
	
	
	
	public Produto() {
		super();
	}

	public Produto(int id, String descricao, double valorCompra, double valorVenda, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
	}

	public String getVerificaEstoque() {
		if(qtde > 20) {
			return "Estoque Alto";
		}else if (qtde >= 10 && qtde <= 20) {
			return "Estoque Médio";
		}else {
			return "Estoque Baixo";
		}
	}
	
	public void setAtualizavalores(double porc) {
		valorCompra = valorCompra + valorCompra * (porc/100);
		valorVenda = valorVenda + valorVenda * (porc/100);
	}
	
	public double getTotalVenda() {
		return valorVenda *qtde;
	}
	
	public double getDesconto(double porc) {
		return valorVenda - (valorVenda * (porc/100));
	}

	public double getDesconto() {
		return  valorVenda - (valorVenda * 0.1);
	}
	
	public String toString() {
		return "ID: " + id + ", Descrição: " + descricao + ", Valor de Compra :" + valorCompra + 
				", Valor de venda: " + valorVenda + ", Quantidade : " + qtde ;
	}

	public void setAll(int id, String descricao, double vc, double vv, int q) {
		this.id = id;
		this.descricao = descricao;
		valorCompra =  vc;
		valorVenda = vv;
		qtde = q;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}



}
