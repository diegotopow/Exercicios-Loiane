package com.aula16.labs;

public class Ex49 {
    
    public static void main(String[] args) {
        
        // Faça um programa que mostre os n termos da Série a seguir:
        // S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + numero/m.
        // Imprima no final a soma da série.
        int numero = 0;
        int m = 1;
        double somaSerie = 0;
        System.out.println("Digite um número: ");
        numero = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= numero; i++) {
            m += 2;
            somaSerie += (double) i / m;
        }
        System.out.println("Soma da série: " + somaSerie);
    }
}