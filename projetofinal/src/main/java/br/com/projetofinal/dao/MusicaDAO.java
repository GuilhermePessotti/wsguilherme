package br.com.projetofinal.dao;

import java.util.Date; //date sempre Java util
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.modelo.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer> {
	
	List<Musica> findByCadastroBetween(Date inicio, Date termino); //Pesquisa pelo atributo cadastro utilizando um intervalo de datas.
	
	

}
