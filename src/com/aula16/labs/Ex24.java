package com.aula16.labs;

public class Ex24 {
    
    public static void main(String[] args) {
        
        // Faça um programa que calcule o mostra a média aritmética de N notas.
        System.out.print("Digite a quantidade de notas: ");
        int qtd = new java.util.Scanner(System.in).nextInt();
        double soma = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = new java.util.Scanner(System.in).nextDouble();
            soma += nota;
        }
        System.out.println("Média: " + (soma / qtd));
    }
}