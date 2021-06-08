package br.com.projetofinal.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.modelo.Artista;

public interface ArtistaDAO extends CrudRepository<Artista,Integer> { //Integer é o tipo da chave primaria
	
	List<Artista> findByNacionalidadeLike(String nac);

}
