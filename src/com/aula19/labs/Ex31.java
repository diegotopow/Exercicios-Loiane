package com.aula19.labs;

public class Ex31 {
    
    public static void main(String[] args) {
        
        //  Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas
        // um vetor extra B. Sugestão: no início do vetor B armazene os elementos pares de A e nas
        // posições restantes do vetor B armazene os elementos de A que são ímpares.

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int qtdB = 0;
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
            }
        }
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[qtdB] = vetorA[i];
                qtdB++;
            }
        }
        System.out.println("Vetor B: ");
        for (int i = 0; i < qtdB; i++) {
            System.out.println(vetorB[i] + " ");
        }
    }
}