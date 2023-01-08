package com.aula16.labs;

public class Ex07 {
    
    public static void main(String[] args) {
        
        // Faça um programa que leia 5 números e informe o maior número.
        int maior = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("Maior: " + maior);
    }
}