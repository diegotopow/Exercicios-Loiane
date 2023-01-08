package com.aula15.labs;

public class Ex01 {
    
    public static void main(String[] args) {
        
        // Faça um Programa que peça dois números e imprima o maior deles.
        System.out.println("Digite o primeiro número: ");
        double num1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = new java.util.Scanner(System.in).nextDouble();
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }
}
