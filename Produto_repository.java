package com.pooltaria.projeto.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.pooltaria.projeto.model.Produto;

public interface Produto_repository extends JpaRepository<Produto, Long>{

   List<Produto> findByNomeContainingIgnoreCase(String nome);
} 

