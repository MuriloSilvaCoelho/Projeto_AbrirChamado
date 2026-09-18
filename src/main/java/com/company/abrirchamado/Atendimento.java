package com.company.abrirchamado;

import java.time.LocalDateTime;

public class Atendimento {

    private long id;
    private LocalDateTime dataHora;
    private String descricao;

    // Técnico que realizou este atendimento
    private Tecnico realizadoPor;

    public Atendimento(long id) {

        this.id = id;
    }

    public void registrar(String descricao, Tecnico tecnico) {

        // Guarda a descrição da ação/solução realizada
        this.descricao = descricao;

        // Guarda qual técnico realizou o atendimento
        this.realizadoPor = tecnico;

        // Registra automaticamente a data e hora
        this.dataHora = LocalDateTime.now();
    }

    public long getId() {

        return id;
    }

    public LocalDateTime getDataHora() {

        return dataHora;
    }

    public String getDescricao() {

        return descricao;
    }

    public Tecnico getRealizadoPor() {

        return realizadoPor;
    }
}