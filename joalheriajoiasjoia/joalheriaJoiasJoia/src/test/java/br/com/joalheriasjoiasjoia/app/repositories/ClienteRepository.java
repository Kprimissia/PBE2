package br.com.joalheriasjoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joalheriasjoiasjoia.app.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
