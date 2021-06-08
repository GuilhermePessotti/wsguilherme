package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.modelo.Usuario;
/*
 * DAO (Data Access Object) é um Pattern que aponta como boa prática
 * que todos os comandos DML (select, insert, update, delete) devem
 * estar em uma camada isolada (dao)
 * Por isso todo DAO contém um CRUD ( Create - Read - Update - Delete)
 */

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{ //Integer é o tipo da chave primaria
	
/*
 * save() => salve um objeto
 * findById() => pesquisa um objeto pela chave primária
 * findAll() => retorna todos as linhas da tabela
 * deleteAll() =>apaga tudo
 * deleteById() => apaga um usuário pela chave primária
 */
	//fonte: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	// Método utilizado para passar para que o DB faça validação de email e senha.
	public Usuario findByEmailAndSenha(String email, String senha); 

}
