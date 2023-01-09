package com.aula19.labs;

public class Ex01 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com 
        // os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = new java.util.Scanner(System.in).nextInt();
            vetorB[i] = vetorA[i];
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
    }
}