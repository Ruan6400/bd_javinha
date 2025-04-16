package com.pooltaria.projeto.services;
import org.springframework.stereotype.Service;

import com.pooltaria.projeto.model.Produto;
import com.pooltaria.projeto.repositories.Produto_repository;

import java.util.List;

@Service
public class Produto_service {
    private final Produto_repository repositorio;

    public Produto_service(Produto_repository repositorio) {
        this.repositorio = repositorio;
    }

    public List<Produto> listarTodos() {
        return repositorio.findAll();
    }

    public Produto salvar(Produto produto){
        return repositorio.save(produto);
    }

    public void deletar(Long Id){
        repositorio.deleteById(Id);
    }

    public Produto buscarPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }
    
}
