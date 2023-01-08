package com.aula16.labs;

public class Ex21 {
    
    public static void main(String[] args) {
        
        // Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.
        System.out.print("Digite um número: ");
        int num = new java.util.Scanner(System.in).nextInt();
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo!");
        }
    }
}