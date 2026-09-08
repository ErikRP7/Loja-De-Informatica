package com.example.LojaDeInformatica.infrastructure.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "produtos")
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String nome;

    @NotNull
    private BigDecimal preco;

    @Column(name = "estoque")
    private Integer quantidadeEstoque;

    @ManyToOne
    private Categoria categoria;

}
