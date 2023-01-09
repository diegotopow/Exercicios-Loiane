package com.aula19.labs;

public class Ex23 {
    
    public static void main(String[] args) {
        
        // Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os
        // elementos do vetor A são pares. Se pelo menos um elemento do vetor não for par o processo de
        // repetição para percorrer os elementos do vetor deve ser encerrado, como sugestão: 
        // utilize uma variável do tipo flag para atingir este propósito.

        int[] vetorA = new int[10];
        boolean flag = true;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 10);
            if (vetorA[i] % 2 != 0) {
                flag = false;
                break;
            }
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        if (flag) {
            System.out.println("Todos os elementos do vetor são pares.");
        } else {
            System.out.println("Não todos os elementos do vetor são pares.");
        }
    }
}