package com.londrina.reporta.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Problema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    private double latitude;
    private double longitude;

    private String imagemUrl;

    private boolean anonimo;

    private LocalDateTime dataCriacao;

    @PrePersist
    protected void onCreate(){
        this.dataCriacao = LocalDateTime.now();
    }    
}