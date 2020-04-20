package com.example.ac1.repository;

import com.example.ac1.entity.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface meuRepository extends JpaRepository<Funcionario, Integer> {

}