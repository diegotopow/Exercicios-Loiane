package com.aula19.labs;

public class Ex32 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada
        // um dos elementos do vetor A.

        int[] vetorA = new int[5];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Tabuada do " + vetorA[i] + ": ");
            for (int j = 0; j <= 10; j++) {
                System.out.println(vetorA[i] + " x " + j + " = " + (vetorA[i] * j));
            }
            System.out.println();
        }
    }
}