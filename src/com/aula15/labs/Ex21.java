package com.aula15.labs;

public class Ex21 {
    
    public static void main(String[] args) {
        
        // Faça um programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas.
        // As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
        // Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
        // Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
        System.out.println("Digite o valor do saque: ");
        int saque = new java.util.Scanner(System.in).nextInt();
        if (saque < 10 || saque > 600) {
            System.out.println("Valor inválido. Superior a R$600,00.");
        } else {
            int notas100 = saque / 100;
            saque = saque % 100;
            int notas50 = saque / 50;
            saque = saque % 50;
            int notas10 = saque / 10;
            saque = saque % 10;
            int notas5 = saque / 5;
            saque = saque % 5;
            int notas1 = saque;
            System.out.println("Notas de R$100: " + notas100);
            System.out.println("Notas de R$50: " + notas50);
            System.out.println("Notas de R$10: " + notas10);
            System.out.println("Notas de R$5: " + notas5);
            System.out.println("Notas de R$1: " + notas1);
        }
    }
}