package com.aula15.labs;

public class Ex09 {
    
    public static void main(String[] args) {
        
        // Faça um programa que leia três números e mostre-os em ordem decrescente.
        System.out.println("Digite o primeiro número: ");
        double num1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = new java.util.Scanner(System.in).nextDouble();
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("Ordem decrescente: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Ordem decrescente: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println("Ordem decrescente: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Ordem decrescente: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 > num2) {
                System.out.println("Ordem decrescente: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Ordem decrescente: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}
