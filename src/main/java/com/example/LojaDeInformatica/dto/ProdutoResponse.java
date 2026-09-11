package com.example.LojaDeInformatica.dto;

import java.math.BigDecimal;

public record ProdutoResponse(Long id,
                              String nome,
                              BigDecimal preco,
                              Integer quantidadeEstoque,
                              String nomeCategoria) {


}
