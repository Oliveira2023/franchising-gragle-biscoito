package com.biscoito.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "tb_produto")
public class Produto {
    @Id
    private int id_produto;
}
