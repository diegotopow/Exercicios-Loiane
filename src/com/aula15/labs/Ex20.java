package com.aula15.labs;

public class Ex20 {
    
    public static void main(String[] args) {
        
        // Faça um programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
        // A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        // A mensagem "Reprovado", se a média for menor do que sete;
        // A mensagem "Aprovado com Distinção", se a média for igual a dez.
        System.out.println("Digite a primeira nota: ");
        double nota1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = new java.util.Scanner(System.in).nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + media);
        if (media == 10) {
            System.out.println("Aprovado com distinção.");
        } else if (media >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
