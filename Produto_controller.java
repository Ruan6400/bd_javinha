package com.pooltaria.projeto.controllers;
import org.springframework.web.bind.annotation.*;

import com.pooltaria.projeto.services.Produto_service;
import com.pooltaria.projeto.model.Produto;

import java.util.List;


@RestController
@RequestMapping("/produtos")
public class Produto_controller {
    private final Produto_service service;

    public Produto_controller(Produto_service service) {
        this.service = service;
    }

    @GetMapping
    public List<Produto> Listar(){
        return service.listarTodos();
    }

    @PostMapping
    public Produto Adicionar(@RequestBody Produto produto){
        return service.salvar(produto);
    }

    @DeleteMapping("/{Id}")
    public void Deletar(@PathVariable Long Id){
        service.deletar(Id);
    }

    @GetMapping("/{Id}")
    public Produto Buscar(@PathVariable Long Id){
        return service.buscarPorId(Id);
    }

}
