package com.dhbtecnologia.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dhbtecnologia.domain.Contato;
import com.dhbtecnologia.service.ContatoService;

@RequestMapping(path = "/contatos")
@RestController
public class ContatoRest {
	
	@Autowired
	private ContatoService service;	
	
	@GetMapping
	public ResponseEntity<List<Contato>> findAll() {
		List<Contato> list = service.finfAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Contato> findById(@PathVariable Long id) {
		Contato obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Contato insert(@RequestBody Contato obj) {
		return service.insert(obj);
	}
	
	@PutMapping("/{id}")
	public Contato update(@PathVariable Long id, @RequestBody Contato obj) {
		return service.update(id, obj);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
