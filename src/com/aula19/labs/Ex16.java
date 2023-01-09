package com.aula19.labs;

public class Ex16 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
        // a) a soma de elementos armazenados neste vetor que são inferiores a 15;
        // b) a quantidade de elementos armazenados no vetor que são iguais a 15; e
        // c) a média dos elementos armazenados no vetor que são superiores a 15.
        int[] vetorA = new int[10];
        int soma = 0;
        int qtd = 0;
        double media = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = new java.util.Scanner(System.in).nextInt();
            if (vetorA[i] < 15) {
                soma += vetorA[i];
            } else if (vetorA[i] == 15) {
                qtd++;
            } else {
                media += vetorA[i];
            }
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Quantidade: " + qtd);
        System.out.println("Média: " + (media / qtd));
    }
}