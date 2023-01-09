package com.aula19.labs;

public class Ex15 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de
        // elementos pares e ímpares, respectivamente, armazenados neste vetor.
        int[] vetorA = new int[10];
        int qtdPar = 0;
        int qtdImpar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = new java.util.Scanner(System.in).nextInt();
            if (vetorA[i] % 2 == 0) {
                qtdPar++;
            } else {
                qtdImpar++;
            }
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Percentual de pares: " + (qtdPar * 100 / vetorA.length) + "%");
        System.out.println("Percentual de ímpares: " + (qtdImpar * 100 / vetorA.length) + "%");
    }
}