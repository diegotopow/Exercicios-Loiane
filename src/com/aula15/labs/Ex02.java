package com.aula15.labs;

public class Ex02 {
    
    public static void main(String[] args) {
        
        // Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
        System.out.println("Digite um número: ");
        double num = new java.util.Scanner(System.in).nextDouble();
        if (num >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
    }
}
