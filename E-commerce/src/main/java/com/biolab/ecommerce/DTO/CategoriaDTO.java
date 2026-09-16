package com.biolab.ecommerce.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoriaDTO {
    private long id;
    private String nome;

    public CategoriaDTO(String nome) {
        this.nome = nome;
    }
}