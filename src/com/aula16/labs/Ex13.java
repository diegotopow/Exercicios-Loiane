
package com.aula16.labs;

public class Ex13 {
    
    public static void main(String[] args) {
        
        // Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.
        System.out.print("Digite a base: ");
        int base = new java.util.Scanner(System.in).nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = new java.util.Scanner(System.in).nextInt();
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
    }
}