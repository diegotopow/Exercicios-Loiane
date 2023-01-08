package com.aula15.labs;

public class Ex17 {
    
    public static void main(String[] args) {
        
        // Faça um programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
        // Dicas:
        // Um ano é bissexto se for divisível por 400 ou se for divisível por 4 e não for divisível por 100.
        System.out.println("Digite um ano: ");
        int ano = new java.util.Scanner(System.in).nextInt();
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Ano bissexto.");
        } else {
            System.out.println("Ano não bissexto.");
        }        
    }
}