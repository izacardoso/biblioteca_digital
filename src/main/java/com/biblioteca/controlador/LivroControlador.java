package com.biblioteca.controlador;

import com.biblioteca.modelo.Livro;
import com.biblioteca.servico.LivroServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroControlador {

    @Autowired
    private LivroServico livroServico;

    @PostMapping
    public Livro criarLivro(@RequestBody Livro livro) {
        return livroServico.salvar(livro);
    }

    @GetMapping
    public List<Livro> listarLivros() {
        return livroServico.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarLivro(@PathVariable Long id) {
        return livroServico.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id, @RequestBody Livro livro) {
        Livro atualizado = livroServico.atualizar(id, livro);
        if (atualizado != null) {
            return ResponseEntity.ok(atualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLivro(@PathVariable Long id) {
        livroServico.deletar(id);
        return ResponseEntity.noContent().build();
    }
}