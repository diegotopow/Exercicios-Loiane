package com.aula16.labs;

public class Ex08 {
    
    public static void main(String[] args) {
        
        // Faça um programa que leia 5 números e informe a soma e a média dos números.
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = new java.util.Scanner(System.in).nextInt();
            soma += num;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma / 5));
    }
}