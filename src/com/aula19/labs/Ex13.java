package com.aula19.labs;

public class Ex13 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma dos
        // elementos armazenados neste vetor que são múltiplos de 5.
        int[] vetorA = new int[10];
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = new java.util.Scanner(System.in).nextInt();
            if (vetorA[i] % 5 == 0) {
                soma += vetorA[i];
            }
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Soma: " + soma);
    }
}