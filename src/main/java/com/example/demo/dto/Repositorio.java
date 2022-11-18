package com.example.demo.dto;

import com.example.demo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends JpaRepository<Cliente, Long> {
}
