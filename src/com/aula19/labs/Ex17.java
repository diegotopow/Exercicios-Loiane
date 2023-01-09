package com.aula19.labs;

public class Ex17 {
    
    public static void main(String[] args) {
        
        // Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
        // Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior
        // a 35 anos. 
        int[] vetorA = new int[10];
        int qtd = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = new java.util.Scanner(System.in).nextInt();
            if (vetorA[i] > 35) {
                qtd++;
            }
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Quantidade de pessoas com idade superior a 35 anos é: " + qtd);
    }
}