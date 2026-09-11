package com.example.LojaDeInformatica.dto;

import java.math.BigDecimal;

public record ProdutoRequest(String nome,
                             BigDecimal preco,
                             Integer quantidadeEstoque,
                             String nomeCategoria) {
}
