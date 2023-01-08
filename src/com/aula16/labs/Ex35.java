package com.aula16.labs;

public class Ex35 {
    
    public static void main(String[] args) {
        
        // Encontrar os números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro informado pelo usuário.
        //
        //
        int numero = 0;
        System.out.print("Digite um número: ");
        numero = new java.util.Scanner(System.in).nextInt();
        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}