package com.biblioteca.servico;

import com.biblioteca.modelo.Livro;
import com.biblioteca.repositorio.LivroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroServico {

    @Autowired
    private LivroRepositorio livroRepositorio;

    public Livro salvar(Livro livro) {
        return livroRepositorio.save(livro);
    }

    public List<Livro> listarTodos() {
        return livroRepositorio.findAll();
    }

    public Optional<Livro> buscarPorId(Long id) {
        return livroRepositorio.findById(id);
    }

    public Livro atualizar(Long id, Livro livroAtualizado) {
        return livroRepositorio.findById(id).map(livro -> {
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            livro.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
            livro.setGenero(livroAtualizado.getGenero());
            return livroRepositorio.save(livro);
        }).orElse(null);
    }

    public void deletar(Long id) {
        livroRepositorio.deleteById(id);
    }
}