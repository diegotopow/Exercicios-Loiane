package com.aula19.labs;

public class Ex28 {
    
    public static void main(String[] args) {
        
        // Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho e com os mesmos
        // elementos de A, sendo que estes deverão estar invertidos, ou seja, o primeiro elemento de A
        // passa a ser o último de B, o segundo elemento de A passa a ser o penúltimo de B e assim por diante

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
            vetorB[i] = vetorA[vetorA.length - 1 - i];
        }
        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}