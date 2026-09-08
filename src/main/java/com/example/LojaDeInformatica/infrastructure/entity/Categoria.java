package com.example.LojaDeInformatica.infrastructure.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "categoria")
@Getter
@Setter
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategoria;

    @NotNull
    @Column(unique = true)
    private String nomeCategoria;


}
