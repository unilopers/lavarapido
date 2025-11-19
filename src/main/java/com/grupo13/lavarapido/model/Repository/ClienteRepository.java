package com.example.demo.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
    Iterable<Cliente> findByPrimeiroNome(String nome);
    Iterable<Cliente> findBySobrenome(String sobrenome);
    
}