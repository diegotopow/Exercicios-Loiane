package com.aula16.labs;

public class Ex20 {
    
    public static void main(String[] args) {
        
        // Altere o programa de calculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
        int num = 0;
        do {
            System.out.print("Digite um número: ");
            num = new java.util.Scanner(System.in).nextInt();
            if (num < 0 || num > 16) {
                System.out.println("Número inválido!");
                continue;
            }
            int fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println(num + "! = " + fatorial);
        } while (num != 0);
    }
}