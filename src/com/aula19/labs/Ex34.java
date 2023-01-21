package com.aula19.labs;

public class Ex34 {
    
    public static void main(String[] args) {
        
        //  Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do
        // vetor A e a relação de todos os pares de 0 até o respectivo elemento.

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
            for (int j = 0; j <= vetorA[i]; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}