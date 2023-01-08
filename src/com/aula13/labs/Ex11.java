package com.aula13.labs;

public class Ex11 {
    
    public static void main(String[] args) {
        
        //Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        //a. o produto do dobro do primeiro com metade do segundo.
        //b. a soma do triplo do primeiro com o terceiro.
        //c. o terceiro elevado ao cubo.
        System.out.println("Digite dois números inteiros e um número real: ");
        int num1 = new java.util.Scanner(System.in).nextInt();
        int num2 = new java.util.Scanner(System.in).nextInt();
        double num3 = new java.util.Scanner(System.in).nextDouble();
        double a = (num1 * 2) * (num2 / 2);
        double b = (num1 * 3) + num3;
        double c = Math.pow(num3, 3);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + b);
        System.out.println("O terceiro elevado ao cubo é: " + c);
    }
}