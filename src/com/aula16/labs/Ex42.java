package com.aula16.labs;

public class Ex42 {
    
    public static void main(String[] args) {
        
        // Faça um programa que leia uma quantidade indeterminada de números positivos e conte quantos 
        //deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados 
        //deverá terminar quando for lido um número negativo.
        int numero = 0;
        int contador0a25 = 0;
        int contador26a50 = 0;
        int contador51a75 = 0;
        int contador76a100 = 0;
        do {
            System.out.println("Digite um número positivo: ");
            numero = new java.util.Scanner(System.in).nextInt();
            if (numero >= 0 && numero <= 25) {
                contador0a25++;
            } else if (numero >= 26 && numero <= 50) {
                contador26a50++;
            } else if (numero >= 51 && numero <= 75) {
                contador51a75++;
            } else if (numero >= 76 && numero <= 100) {
                contador76a100++;
            }
        } while (numero >= 0);
        System.out.println("A quantidade de números entre 0 e 25 é " + contador0a25 + ".");
        System.out.println("A quantidade de números entre 26 e 50 é " + contador26a50 + ".");
        System.out.println("A quantidade de números entre 51 e 75 é " + contador51a75 + ".");
        System.out.println("A quantidade de números entre 76 e 100 é " + contador76a100 + ".");
    }
}