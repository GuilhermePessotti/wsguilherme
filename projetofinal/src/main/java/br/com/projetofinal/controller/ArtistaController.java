package br.com.projetofinal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.dao.ArtistaDAO;
import br.com.projetofinal.modelo.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {
	@Autowired
	private ArtistaDAO dao;
	
	@PostMapping("/apagarartista")
	public ResponseEntity<Boolean> deleteArtista(@RequestBody Artista objeto){
		try {
		dao.deleteById(objeto.getId());
		return ResponseEntity.ok(true);
	}catch(Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(403).build();
	}
}	
	
	@PostMapping("/nacionalidade2") // ESTRUTURA BEM GENÉRICA COM LISTA
	public ResponseEntity<List<Artista>> getArtistaNacionalidade2(@RequestBody Artista objeto){
		List<Artista> lista = (List<Artista>) dao.findAll();
		
		List<Artista> resposta = new ArrayList<Artista>();
		
		for (Artista obj : lista) {
			if (obj.getNacionalidade().equals(objeto.getNacionalidade())) {
				resposta.add(obj);
			}
		}
		
		if (resposta.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
		
	}
	
	@PostMapping("/nacionalidade")
	public ResponseEntity<List<Artista>> getArtistaNacionalidade(@RequestBody Artista objeto){
		List<Artista> lista = dao.findByNacionalidadeLike(objeto.getNacionalidade() + "%");
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/artista")
	public ResponseEntity<Artista> getArtista(@RequestBody Artista objeto){
		Artista resposta = dao.findById(objeto.getId()).orElse(null);
		if(resposta ==null) {
			return ResponseEntity.status(403).build();
		}else {
			return ResponseEntity.ok(resposta);
		}
}

	
	@GetMapping("/artistas")//definindo a rota do metodo get.
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista = (List<Artista>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return  ResponseEntity.ok(lista);
	}
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> addUser(@RequestBody Artista objeto){
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(403).build();	
		}	
	}
	

}
