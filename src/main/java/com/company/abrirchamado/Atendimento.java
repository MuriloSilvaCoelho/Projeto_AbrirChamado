package com.company.abrirchamado;
import java.time.LocalDateTime;

public class Atendimento {

    private long id;
    private LocalDateTime dataHora;
    private String descricao;
    private Tecnico realizadoPor;

    public Atendimento(long id) {
        this.id = id;
    }

    public void registrar(String descricao, Tecnico tecnico) {

        this.descricao = descricao;
        this.realizadoPor = tecnico;
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

