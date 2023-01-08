package com.aula16.labs;

public class Ex10 {
    
    public static void main(String[] args) {
        
        // Faça um programa que receba dois números inteiros e gere os números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
        System.out.print("Digite um número: ");
        int num1 = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite outro número: ");
        int num2 = new java.util.Scanner(System.in).nextInt();
        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.println(i);
            }
        }        
    }
}