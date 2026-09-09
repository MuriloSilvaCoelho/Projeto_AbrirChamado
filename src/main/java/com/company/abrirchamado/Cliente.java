package com.company.abrirchamado;
    public class Cliente extends Usuario{
    private String CpfCnpj;
    private String endereco;

    public Cliente(long id, String nome, String email, String telefone, String CpfCnpj, String endereco) {
        super(id, nome, email, telefone);
        this.CpfCnpj = CpfCnpj;
        this.endereco = endereco;
    }
    
    public String getCpfCnpj ()
    { return CpfCnpj;
    }   

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
