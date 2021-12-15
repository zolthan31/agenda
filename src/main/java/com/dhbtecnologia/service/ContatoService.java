package com.dhbtecnologia.service;

import java.util.List;

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
		
	}

}
