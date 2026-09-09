package com.company.abrirchamado;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Chamado {

    private long id;
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private StatusChamado status;

    private LocalDateTime dataAbertura;
    private LocalDateTime dataEncerramento;

    private Cliente cliente;
    private Tecnico tecnico;

    private List<Atendimento> atendimentos;

    public Chamado(long id, String titulo,
                   String descricao,
                   Prioridade prioridade,
                   Cliente cliente) {

        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;

        this.cliente = cliente;

        this.status = StatusChamado.ABERTO;

        this.dataAbertura = LocalDateTime.now();

        this.atendimentos = new ArrayList<>();
    }


    public void atribuirTecnico(Tecnico tecnico) {

        if (status == StatusChamado.ABERTO ||
            status == StatusChamado.AGUARDANDO_CLIENTE) {

            this.tecnico = tecnico;

            this.status = StatusChamado.EM_ATENDIMENTO;

        } else {

            System.out.println(
                "Não é possível atribuir técnico neste status."
            );
        }
    }


    public void alterarStatus(StatusChamado status) {

        this.status = status;
    }


    public boolean estaAberto() {

        return status == StatusChamado.ABERTO;
    }


    public void registrarAtendimento(Atendimento atendimento) {

        atendimentos.add(atendimento);
    }


    public void encerrar() {

        if (atendimentos.isEmpty()) {

            System.out.println(
                "Não é possível encerrar o chamado sem atendimento."
            );

        } else {

            this.status = StatusChamado.ENCERRADO;

            this.dataEncerramento = LocalDateTime.now();

            System.out.println(
                "Chamado encerrado com sucesso."
            );
        }
    }
}