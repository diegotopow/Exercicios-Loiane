package com.aula16.labs;

public class Ex34 {
    
    public static void main(String[] args) {
        
        // Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
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