package com.aula15.labs;

public class Ex14 {
    
    public static void main(String[] args) {
        
        // Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
        // Média de Aproveitamento   Conceito
        // Entre 9.0 e 10.0             A
        // Entre 7.5 e 9.0              B
        // Entre 6.0 e 7.5              C
        // Entre 4.0 e 6.0              D
        // Entre 4.0 e zero             E
        // O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
        System.out.println("Digite a primeira nota: ");
        double nota1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = new java.util.Scanner(System.in).nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        if (media >= 9 && media <= 10) {
            System.out.println("Conceito: A");
            System.out.println("APROVADO");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Conceito: B");
            System.out.println("APROVADO");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Conceito: C");
            System.out.println("APROVADO");
        } else if (media >= 4 && media < 6) {
            System.out.println("Conceito: D");
            System.out.println("REPROVADO");
        } else if (media >= 0 && media < 4) {
            System.out.println("Conceito: E");
            System.out.println("REPROVADO");
        } else {
            System.out.println("Valor inválido");
        }        
    }
}