package com.aula19.labs;

public class Ex12 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma
        // de todos os elementos armazenados neste vetor.
        int[] vetorA = new int[10];
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = new java.util.Scanner(System.in).nextInt();
            soma += vetorA[i];
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Soma: " + soma);
    }
}