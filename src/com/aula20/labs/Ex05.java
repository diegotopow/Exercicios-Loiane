package com.aula20.labs;

public class Ex05 {
    
    public static void main(String[] args) {
        
        // Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizados
        // por mês, dia e hora (só 8 horas por dia).

        String[][][] agenda = new String[12][31][8]; // matriz para armazenar os compromissos
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Consultar compromisso");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = EntradaTeclado.leInt();
    
            switch (opcao) {
                case 1: // adicionar compromisso
                    System.out.print("Digite o mês (1-12): ");
                    int mes = EntradaTeclado.leInt();
                    System.out.print("Digite o dia do mês (1-31): ");
                    int dia = EntradaTeclado.leInt();
                    System.out.print("Digite a hora (0-7): ");
                    int hora = EntradaTeclado.leInt();
                    System.out.print("Digite o compromisso: ");
                    String compromisso = EntradaTeclado.leString();
                    agenda[mes - 1][dia - 1][hora] = compromisso; // armazenar compromisso na matriz
                    System.out.println("Compromisso adicionado com sucesso!\n");
                    break;
                case 2: // consultar compromisso
                    System.out.print("Digite o mês (1-12): ");
                    mes = EntradaTeclado.leInt();
                    System.out.print("Digite o dia do mês (1-31): ");
                    dia = EntradaTeclado.leInt();
                    System.out.print("Digite a hora (0-7): ");
                    hora = EntradaTeclado.leInt();
                    if (agenda[mes - 1][dia - 1][hora] == null) {
                        System.out.println("Não há compromisso agendado para este dia e hora.");
                    } else {
                        System.out.println("Compromisso: " + agenda[mes - 1][dia - 1][hora]);
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