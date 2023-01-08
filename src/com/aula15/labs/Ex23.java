package com.aula15.labs;

public class Ex23 {
    
    public static void main(String[] args) {
        
        // Faça um programa que peça um número e informe se o número é inteiro ou decimal.
        // Dica: utilize uma função de arredondamento.
        System.out.println("Digite um número: ");
        double numero = new java.util.Scanner(System.in).nextDouble();
        if (numero == Math.round(numero)) {
            System.out.println("Número inteiro.");
        } else {
            System.out.println("Número decimal.");
        }        
    }
}