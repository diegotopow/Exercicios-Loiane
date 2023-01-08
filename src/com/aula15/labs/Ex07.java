package com.aula15.labs;

public class Ex07 {
    
    public static void main(String[] args) {

        // Faça um programa que leia três números e mostre o maior e o menor deles.
        System.out.println("Digite o primeiro número: ");
        double num1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = new java.util.Scanner(System.in).nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
            if (num2 < num3) {
                System.out.println("O menor número é: " + num2);
            } else {
                System.out.println("O menor número é: " + num3);
            }
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
            if (num1 < num3) {
                System.out.println("O menor número é: " + num1);
            } else {
                System.out.println("O menor número é: " + num3);
            }
        } else {
            System.out.println("O maior número é: " + num3);
            if (num1 < num2) {
                System.out.println("O menor número é: " + num1);
            } else {
                System.out.println("O menor número é: " + num2);
            }
        }
    }
}