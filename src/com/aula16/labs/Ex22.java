package com.aula16.labs;

public class Ex22 {
    
    public static void main(String[] args) {
        
        // Altere o programa de cálculo de números primos, informando, caso o número não seja primo, por quais número ele é divisível.
        System.out.print("Digite um número: ");
        int num = new java.util.Scanner(System.in).nextInt();
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                System.out.println("Divisível por " + i);
            }
        }
        if (primo) {
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo!");
        }
    }
}