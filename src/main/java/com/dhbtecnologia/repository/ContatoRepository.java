package com.dhbtecnologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhbtecnologia.domain.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
