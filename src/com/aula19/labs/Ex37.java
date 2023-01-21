package com.aula19.labs;

public class Ex37 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que
        // cada elemento do vetor B seja fatorial do elemento correspondente em A.

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            int fatorial = 1;
            for (int j = vetorA[i]; j > 1; j--) {
                fatorial *= j;
            }
            vetorB[i] = fatorial;
        }
        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}