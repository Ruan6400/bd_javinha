package com.bdzin.demonio.controllers;
import org.springframework.web.bind.annotation.*;

import com.bdzin.demonio.services.Produto_service;
import com.bdzin.demonio.models.Produto;

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
    public String Adicionar(
        @RequestParam String nome,
        @RequestParam double preco){
        service.salvar(new Produto(nome,preco));
        return "Add";
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
