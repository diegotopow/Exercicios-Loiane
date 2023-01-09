package com.aula19.labs;

public class Ex21 {
    
    public static void main(String[] args) {
        
        // A[i] = cotação do dolar * i, para todo i variando de 1 até 20.

        double cotacao = 0;
        double[] vetorA = new double[20];
        System.out.println("Digite a cotação do dólar: ");
        cotacao = new java.util.Scanner(System.in).nextDouble();
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (i + 1) * cotacao;
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }
}