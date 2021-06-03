package br.com.unixyz.implementacao;


import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.modelo.Turma;
import util.Magica;

public class TesteTurma {
	

	
	public static void main(String[] args) {
		
		
		Turma turma = new Turma(
				Magica.s("SIGLA"),
				Magica.s("Periodo"),
				Magica.s("Sala"),
				new Professor(),
				new Curso(),
				new Aluno(
						Magica.i("RM"),
						new Endereco()
						)
				);
				
				System.out.println(turma.toString());
				
	}

}
