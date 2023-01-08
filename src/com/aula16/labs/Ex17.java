package com.aula16.labs;

public class Ex17 {
    
    public static void main(String[] args) {
        
        // Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=
        System.out.print("Digite um número: ");
        int num = new java.util.Scanner(System.in).nextInt();
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println(num + "! = " + fatorial);
    }
}