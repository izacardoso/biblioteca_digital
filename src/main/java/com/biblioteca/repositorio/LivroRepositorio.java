package com.biblioteca.repositorio;

import com.biblioteca.modelo.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepositorio extends JpaRepository<Livro, Long> {
}