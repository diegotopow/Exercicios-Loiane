package com.aula19.labs;

public class Ex39 {
    
    public static void main(String[] args) {
        
        //  Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um programa que realize
        // a interseção  dos vetores A e B para produzir um vetor C. Interseção de conjuntos = todos os 
        // elementos que existem em A e também existem em B. 

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 10);
            vetorB[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        int posicaoC = 0;
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorC[posicaoC] = vetorA[i];
                    posicaoC++;
                }
            }
        }
        System.out.println("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}