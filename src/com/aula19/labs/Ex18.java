package com.aula19.labs;

public class Ex18 {
    
    public static void main(String[] args) {
        
        // Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
        // Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
        int[] vetorA = new int[10];
        int maior = 0;
        int menor = 0;
        int posMaior = 0;
        int posMenor = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor A: ");
            vetorA[i] = new java.util.Scanner(System.in).nextInt();
            if (i == 0) {
                maior = vetorA[i];
                menor = vetorA[i];
            }
            if (vetorA[i] > maior) {
                maior = vetorA[i];
                posMaior = i;
            }
            if (vetorA[i] < menor) {
                menor = vetorA[i];
                posMenor = i;
            }
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Maior idade: " + maior + " na posição " + posMaior);
        System.out.println("Menor idade: " + menor + " na posição " + posMenor);
    }
}