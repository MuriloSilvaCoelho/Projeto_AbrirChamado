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

    // Cliente responsável pela abertura do chamado
    private Cliente cliente;

    // Apenas um técnico pode estar responsável pelo chamado por vez
    private Tecnico tecnico;

    // Lista que guarda todos os atendimentos realizados
    private List<Atendimento> atendimentos;

    public Chamado(
        long id,
        String titulo,
        String descricao,
        Prioridade prioridade,
        Cliente cliente
    ) {

        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.cliente = cliente;

        // Todo chamado começa como ABERTO
        this.status = StatusChamado.ABERTO;

        // Registra automaticamente o momento da abertura
        this.dataAbertura = LocalDateTime.now();

        // Inicializa a lista de atendimentos vazia
        this.atendimentos = new ArrayList<>();
    }

    public void atribuirTecnico(Tecnico tecnico) {

        // O técnico só pode assumir um chamado ABERTO
        if (status == StatusChamado.ABERTO) {

            // Guarda o técnico responsável
            this.tecnico = tecnico;

            // Após ser assumido, o chamado entra em atendimento
            this.status = StatusChamado.EM_ATENDIMENTO;

            System.out.println(
                "Chamado atribuído ao técnico com sucesso."
            );

        } else {

            System.out.println(
                "Não é possível assumir o chamado, pois ele não está ABERTO."
            );
        }
    }

    public void alterarStatus(StatusChamado status) {

        this.status = status;
    }

    public boolean estaAberto() {

        // Retorna true somente quando o chamado estiver ABERTO
        return status == StatusChamado.ABERTO;
    }

    public void registrarAtendimento(Atendimento atendimento) {

        // Adiciona o atendimento ao histórico do chamado
        atendimentos.add(atendimento);
    }

    public void encerrar() {

        // Impede o encerramento sem nenhum atendimento registrado
        if (atendimentos.isEmpty()) {

            System.out.println(
                "Não é possível encerrar o chamado sem atendimento."
            );

        } else {

            // Altera o status para ENCERRADO
            this.status = StatusChamado.ENCERRADO;

            // Registra automaticamente a data e hora do encerramento
            this.dataEncerramento = LocalDateTime.now();

            System.out.println(
                "Chamado encerrado com sucesso."
            );
        }
    }
}