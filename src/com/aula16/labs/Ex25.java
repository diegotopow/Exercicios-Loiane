package com.aula16.labs;

public class Ex25 {
    
    public static void main(String[] args) {
        
        // Faça um programa que peça para n pessoas a sua idade, ao final o programa
        // devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e
        // maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a
        // média calculada.
        System.out.print("Digite a quantidade de pessoas: ");
        int qtd = new java.util.Scanner(System.in).nextInt();
        double soma = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            double idade = new java.util.Scanner(System.in).nextDouble();
            soma += idade;
        }
        double media = soma / qtd;
        System.out.println("Média (idade): " + media);
        if (media >= 0 && media <= 25) {
            System.out.println("Turma jovem.");
        } else if (media > 25 && media <= 60) {
            System.out.println("Turma adulta.");
        } else {
            System.out.println("Turma idosa.");
        }
    }
}