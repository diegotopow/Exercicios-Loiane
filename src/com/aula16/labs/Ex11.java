package com.aula16.labs;

public class Ex11 {
    
    public static void main(String[] args) {
        
        // Altere o programa anterior para mostrar no final a soma dos números.
        System.out.print("Digite um número: ");
        int num1 = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite outro número: ");
        int num2 = new java.util.Scanner(System.in).nextInt();
        int soma = 0;
        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
                soma += i;
            }
        } else {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.println(i);
                soma += i;
            }
        }
        System.out.println("Soma: " + soma);
    }
}