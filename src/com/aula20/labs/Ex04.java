package com.aula20.labs;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        
        // Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia
        // do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos associar um tarefa
        // específica (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do
        // mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário pode
        // também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.

        String[][] agenda = new String[31][24]; // matriz para armazenar os compromissos
        Scanner input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Consultar compromisso");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();
    
            switch (opcao) {
                case 1: // adicionar compromisso
                    System.out.print("Digite o dia do mês (1-31): ");
                    int dia = input.nextInt();
                    System.out.print("Digite a hora (0-23): ");
                    int hora = input.nextInt();
                    input.nextLine(); // limpar buffer
                    System.out.print("Digite o compromisso: ");
                    String compromisso = input.nextLine();
                    agenda[dia - 1][hora] = compromisso; // armazenar compromisso na matriz
                    System.out.println("Compromisso adicionado com sucesso!\n");
                    break;
                case 2: // consultar compromisso
                    System.out.print("Digite o dia do mês (1-31): ");
                    dia = input.nextInt();
                    System.out.print("Digite a hora (0-23): ");
                    hora = input.nextInt();
                    if (agenda[dia - 1][hora] == null) {
                        System.out.println("Não há compromisso agendado para este dia e hora.");
                    } else {
                        System.out.println("Compromisso: " + agenda[dia - 1][hora]);
                    }
                    break;
                case 3: // sair
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (opcao != 3);
    }
}