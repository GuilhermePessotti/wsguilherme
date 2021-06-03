package br.com.unixyz.modelo;

public class Pos extends Curso {
	
	public boolean interambio;
	private String nivel;
	
	
	
	public boolean isInterambio() {
		return interambio;
	}



	public void setInterambio(boolean interambio) {
		this.interambio = interambio;
	}



	public String getNivel() {
		return nivel;
	}



	public void setNivel(String nivel) {
		this.nivel = nivel;
	}



	public Pos() {
		super();
	}



	public Pos(String nome, String titulacao, double valor, int cargaHoraria, boolean interambio, String nivel) {
		super(nome, titulacao, valor, cargaHoraria);
		this.interambio = interambio;
		this.nivel = nivel;
	}



	@Override
	public String toString() {
		return "Pos [interambio=" + interambio + ", nivel=" + nivel + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
