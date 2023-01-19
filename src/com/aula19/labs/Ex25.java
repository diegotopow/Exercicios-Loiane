package com.aula19.labs;

public class Ex25 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, 
        // obedecendo as seguintes regras de formação: 
        // a) Bi deverá receber 1 quando Ai for par; 
        // b) Bi deverá receber 0 quando Ai for ímpar.

        int[] vetorA = new int[10];
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
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }
        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}