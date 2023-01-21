package com.aula19.labs;

public class Ex42 {
    
    public static void main(String[] args) {
        
        //  Ler 10 elementos inteiros em um vetor A e colocá-los em ordem crescente e apresentar os
        // elementos ordenados.

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
            for (int j = 0; j < vetorA.length; j++) {
                if (vetorA[i] < vetorA[j]) {
                    int aux = vetorA[i];
                    vetorA[i] = vetorA[j];
                    vetorA[j] = aux;
                }
            }
        }
        System.out.println("Vetor A ordenado: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }
}