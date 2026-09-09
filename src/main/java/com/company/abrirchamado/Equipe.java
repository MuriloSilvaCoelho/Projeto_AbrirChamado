package com.company.abrirchamado;
import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private long id;
    private String nome;
    private String descricao;

    private List<Tecnico> tecnicos;

    public Equipe(long id, String nome, String descricao) {

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;

        this.tecnicos = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void adicionarTecnico(Tecnico tecnico) {

        tecnicos.add(tecnico);
    }
}