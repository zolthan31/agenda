package com.dhbtecnologia.service;

import java.util.List;


import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhbtecnologia.domain.Contato;

import com.dhbtecnologia.repository.ContatoRepository;


@Service 
public class ContatoService {
	
	@Autowired 
	private ContatoRepository repository;
	
	public List<Contato> finfAll() {
		return repository.findAll();
	}
	
	public Contato findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("contato não encontrado"));
	}
	
	public Contato insert(Contato contato) {
		return repository.save(contato);
		
	}
	
	public Contato update(Long id, Contato contato) {
		if(!repository.existsById(id)) throw new EntityNotFoundException("Tipo de contato não encontrado");
		return repository.save(contato);
		
	}
	
	public void delete(Long id) {
		Contato contato = this.findById(id);
		repository.delete(contato);
	}

}
