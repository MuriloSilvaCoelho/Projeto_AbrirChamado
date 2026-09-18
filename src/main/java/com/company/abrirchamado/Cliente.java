package com.company.abrirchamado;

public class Cliente extends Usuario {

    private String cpfCnpj;
    private String endereco;

    public Cliente(
        long id,
        String nome,
        String email,
        String telefone,
        String cpfCnpj,
        String endereco
    ) {

        // Envia os dados comuns para o construtor de Usuario
        super(id, nome, email, telefone);

        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
    }

    public String getCpfCnpj() {

        return cpfCnpj;
    }

    public String getEndereco() {

        return endereco;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }
}