package com.company.abrirchamado;

import java.util.Scanner;

public class AbrirChamado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Simula um cliente que já está cadastrado no sistema
        Cliente cliente = new Cliente(
            1,
            "Carlos",
            "carlos@email.com",
            "11999999999",
            "12345678900",
            "Rua Exemplo, 100"
        );

        // Cliente informa os dados necessários para abrir o chamado
        System.out.print("Digite o título do chamado: ");
        String titulo = entrada.nextLine();

        System.out.print("Digite a descrição do problema: ");
        String descricao = entrada.nextLine();

        System.out.print("Digite a prioridade (BAIXA, MEDIA ou ALTA): ");
        Prioridade prioridade = Prioridade.valueOf(
            entrada.nextLine().toUpperCase()
        );

        // Cria o chamado associado ao cliente
        // O status será ABERTO automaticamente
        Chamado chamado = new Chamado(
            1,
            titulo,
            descricao,
            prioridade,
            cliente
        );

        // Simula um técnico já cadastrado no sistema
        Tecnico tecnico = new Tecnico(
            1,
            "João",
            "joao@email.com",
            "11999999999",
            "Suporte Técnico"
        );

        // O técnico consulta se o chamado está disponível
        if (chamado.estaAberto()) {

            System.out.println("Chamado disponível para atendimento.");

            // Como está ABERTO, o técnico assume o chamado
            chamado.atribuirTecnico(tecnico);

            // Cria uma ocorrência de atendimento
            Atendimento atendimento = new Atendimento(1);

            System.out.print(
                "Digite a descrição da solução ou ação realizada: "
            );

            String descricaoAtendimento = entrada.nextLine();

            // Registra a descrição, o técnico e a data/hora
            atendimento.registrar(
                descricaoAtendimento,
                tecnico
            );

            // Adiciona a ocorrência ao histórico do chamado
            chamado.registrarAtendimento(atendimento);

            // Técnico finaliza o serviço
            chamado.encerrar();

        } else {

            System.out.println(
                "O chamado não está disponível para atendimento."
            );
        }

        entrada.close();
    }
}