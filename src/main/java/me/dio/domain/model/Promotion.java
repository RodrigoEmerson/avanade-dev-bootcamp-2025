package me.dio.domain.model;


/*
Promotion → Promocao

Promotion: Representa uma promoção do produto,
 com desconto e preço promocional.
 */

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_promotion")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 6 , scale = 2)
    private BigDecimal desconto;

    @Column(precision = 6 , scale = 2)
    private BigDecimal precoPromocional;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(BigDecimal precoPromocional) {
        this.precoPromocional = precoPromocional;
    }
}
