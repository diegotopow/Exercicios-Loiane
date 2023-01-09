package com.aula19.labs;

public class Ex08 {
    public static void main(String[] args) {
        
        // Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada
        // elemento de C é a multiplicação dos respectivos elementos em A e B, ou seja: C[i] = A[i] * B[i].
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = new java.util.Scanner(System.in).nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor B: ");
            vetorB[i] = new java.util.Scanner(System.in).nextInt();
        }
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
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
        System.out.println("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}