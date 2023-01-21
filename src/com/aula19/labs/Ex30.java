package com.aula19.labs;

public class Ex30 {
    
    public static void main(String[] args) {
        
        // Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos vetor B e C serão
        // armazenados o valores pares e ímpares de A, respectivamente.

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        int qtdB = 0;
        int qtdC = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[qtdB] = vetorA[i];
                qtdB++;
            } else {
                vetorC[qtdC] = vetorA[i];
                qtdC++;
            }
        }
        System.out.println("Vetor B: ");
        for (int i = 0; i < qtdB; i++) {
            System.out.println(vetorB[i] + " ");
        }
    }
}