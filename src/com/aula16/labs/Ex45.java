package com.aula16.labs;

public class Ex45 {
    
    public static void main(String[] args) {
        
        // Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões, o 
        //programa deve perguntar ao aluno a resposta de cada questão e ao final comparar com o 
        //gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1 ponto por 
        //resposta certa). Após cada aluno utilizar o sistema deve ser feita uma pergunta se outro 
        //aluno vai utilizar o sistema. Após todos os alunos terem respondido informar:
        // Maior e Menor Acerto;
        // Total de Alunos que utilizaram o sistema;
        // A Média das Notas da Turma.
        // Gabarito da Prova:
        // 01 - A
        // 02 - B
        // 03 - C
        // 04 - D
        // 05 - E
        // 06 - E
        // 07 - D
        // 08 - C
        // 09 - B
        // 10 - A
        // Após concluir isto você poderia incrementar o programa permitindo que o professor
        // digite o gabarito da prova antes dos alunos usarem o programa.
        int totalAlunos = 0;
        int totalAcertos = 0;
        int totalErros = 0;
        int maiorAcerto = 0;
        int menorAcerto = 0;
        double mediaAcertos = 0;
        double mediaErros = 0;
        double mediaTotal = 0;
        int nota = 0;
        int continuar = 0;
        do {
            System.out.println("Digite a resposta da questão 1: ");
            String resposta1 = new java.util.Scanner(System.in).next();
            if (resposta1.equalsIgnoreCase("A")) {
                totalAcertos++;
                nota++;
            } else {
                totalErros++;
            }
            System.out.println("Digite a resposta da questão 2: ");
            String resposta2 = new java.util.Scanner(System.in).next();
            if (resposta2.equalsIgnoreCase("B")) {
                totalAcertos++;
                nota++;
            } else {
                totalErros++;
            }
            System.out.println("Digite a resposta da questão 3: ");
            String resposta3 = new java.util.Scanner(System.in).next();
            if (resposta3.equalsIgnoreCase("C")) {
                totalAcertos++;
                nota++;
            } else {
                totalErros++;
            }
            System.out.println("Digite a resposta da questão 4: ");
            String resposta4 = new java.util.Scanner(System.in).next();
            if (resposta4.equalsIgnoreCase("D")) {
                totalAcertos++;
                nota++;
            } else {
                totalErros++;
            }
            System.out.println("Digite a resposta da questão 5: ");
            String resposta5 = new java.util.Scanner(System.in).next();
            if (resposta5.equalsIgnoreCase("E")) {
                totalAcertos++;
                nota++;
            } else {
                totalErros++;
            }
            System.out.println("Digite a resposta da questão 6: ");
            String resposta6 = new java.util.Scanner(System.in).next();
            if (resposta6.equalsIgnoreCase("E")) {
                totalAcertos++;
                nota++;
            } else {
                totalErros++;
            }
            System.out.println("Digite a resposta da questão 7: ");
            String resposta7 = new java.util.Scanner(System.in).next();
            if (resposta7.equalsIgnoreCase("D")) {
                totalAcertos++;
                nota++;
            } else {
                totalErros++;
            }
            System.out.println("Digite a resposta da questão 8: ");
            String resposta8 = new java.util.Scanner(System.in).next();
            if (resposta8.equalsIgnoreCase("C")) {
                totalAcertos++;
                nota++;
            } else {
                totalErros++;
            }
            System.out.println("Digite a resposta da questão 9: ");
            String resposta9 = new java.util.Scanner(System.in).next();
            if (resposta9.equalsIgnoreCase("B")) {
                totalAcertos++;
                nota++;
            } else {
                totalErros++;
            }
            System.out.println("Digite a resposta da questão 10: ");
            String resposta10 = new java.util.Scanner(System.in).next();
            if (resposta10.equalsIgnoreCase("A")) {
                totalAcertos++;
                nota++;
            } else {
                totalErros++;
            
        }
            System.out.println("Deseja continuar? 1 - Sim / 2 - Não");
            continuar = new java.util.Scanner(System.in).nextInt();
            totalAlunos++;
            if (totalAcertos > maiorAcerto) {
                maiorAcerto = totalAcertos;
            }
            if (totalAcertos < menorAcerto) {
                menorAcerto = totalAcertos;
            }
            mediaAcertos = totalAcertos / totalAlunos;
            mediaErros = totalErros / totalAlunos;
            mediaTotal = nota / totalAlunos;
        } while (continuar == 1);
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Média de acertos: " + mediaAcertos);
        System.out.println("Média de erros: " + mediaErros);
        System.out.println("Média total: " + mediaTotal);
    }
}