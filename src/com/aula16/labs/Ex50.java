package com.aula16.labs;

public class Ex50 {
    
    public static void main(String[] args) {
        
        // Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, faça um programa que calcule o valor de H com N termos.
        int numero = 0;
        double somaSerie = 0;
        System.out.println("Digite um número: ");
        numero = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= numero; i++) {
            somaSerie += (double) 1 / i;
        }
        System.out.println("Soma da série: " + somaSerie);
    }
}