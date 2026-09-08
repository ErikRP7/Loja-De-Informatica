package com.example.LojaDeInformatica.infrastructure.repository;

import com.example.LojaDeInformatica.infrastructure.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
