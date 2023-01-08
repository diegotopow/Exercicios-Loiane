package com.aula15.labs;

public class Ex05 {

    public static void main(String[] args) {
        
        // Façca um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
        // A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        // A mensagem "Reprovado", se a média for menor do que sete;
        // A mensagem "Aprovado com Distinção", se a média for igual a dez.
        System.out.println("Digite a primeira nota: ");
        double nota1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = new java.util.Scanner(System.in).nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media == 10) {
            System.out.println(media);
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println(media);
            System.out.println("Aprovado");
        } else {
            System.out.println(media);
            System.out.println("Reprovado");
        }
    }
}