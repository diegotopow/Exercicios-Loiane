package com.aula19.labs;

public class Ex11 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a
        // quantidade de elementos armazenados neste vetor que são pares.
        int[] vetorA = new int[10];
        int qtdPares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = new java.util.Scanner(System.in).nextInt();
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            }
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Quantidade de pares: " + qtdPares);
    }
}