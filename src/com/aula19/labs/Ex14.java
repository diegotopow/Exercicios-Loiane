package com.aula19.labs;

public class Ex14 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a média
        // aritmética simples dos elementos ímpares armazenados neste vetor.
        int[] vetorA = new int[10];
        int soma = 0;
        int qtd = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = new java.util.Scanner(System.in).nextInt();
            if (vetorA[i] % 2 != 0) {
                soma += vetorA[i];
                qtd++;
            }
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Média: " + (soma / qtd));
    }
}