package com.aula16.labs;

public class Ex14 {
    
    public static void main(String[] args) {
        
        // Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}