package com.company.abrirchamado;
import java.time.LocalDate;

public class Tecnico extends Usuario {

    private String especialidade;
    private LocalDate dataCadastro;

    public Tecnico(long id, String nome, String email,
                   String telefone, String especialidade) {

        super(id, nome, email, telefone);

        this.especialidade = especialidade;
        this.dataCadastro = LocalDate.now();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
}