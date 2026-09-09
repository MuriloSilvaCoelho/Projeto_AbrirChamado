package com.company.abrirchamado;

import java.util.Scanner;

public class AbrirChamado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite o nome do cliente: ");


        String nomeCliente = entrada.nextLine();


        System.out.print("Digite o e-mail do cliente: ");


        String emailCliente = entrada.nextLine();


        System.out.print("Digite o telefone do cliente: ");


        String telefoneCliente = entrada.nextLine();


        System.out.print("Digite o CPF ou CNPJ: ");


        String cpfCnpj = entrada.nextLine();


        System.out.print("Digite o endereço: ");


        String endereco = entrada.nextLine();


        Cliente cliente = new Cliente(
            1,
            nomeCliente,
            emailCliente,
            telefoneCliente,
            cpfCnpj,
            endereco
        );
    }
}