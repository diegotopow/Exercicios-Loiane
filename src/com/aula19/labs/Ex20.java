package com.aula19.labs;

public class Ex20 {
    
    public static void main(String[] args) {
        
        // Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) e a seguir
        // armazene em vetor A com 20 elementos as seguintes conversões:
        // A[i] = U$ i * cotação, sendo i = 1, 2, ..., 20.
        // Após isto, o programa deve exibir o vetor A.

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