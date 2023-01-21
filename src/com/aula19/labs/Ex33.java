package com.aula19.labs;

public class Ex33 {
    
    public static void main(String[] args) {
        
        //  Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do
        // vetor A e uma mensagem indicando se o respectivo elemento é um número primo ou não.

        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            boolean primo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(vetorA[i] + " é primo.");
            } else {
                System.out.println(vetorA[i] + " não é primo.");
            }
        }
    }
}