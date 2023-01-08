package com.aula16.labs;

public class Ex32 {
    
    public static void main(String[] args) {
        
        // Faça um programa que calcule o fatorial de um inteiro fornecido pelo usuário. Ex.: 5!=
        //
        //
        int fatorial = 1;
        int numero = 0;
        System.out.print("Digite um número: ");
        numero = new java.util.Scanner(System.in).nextInt();
        for (int i = numero; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println(numero + "! = " + fatorial);
    }
}