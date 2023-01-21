package com.aula19.labs;

public class Ex35 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do
        // vetor A e a relação de todos os divisores do respectivo elemento.

        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Vetor B: ");
            for (int j = 1; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}