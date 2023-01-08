package com.aula15.labs;

public class Ex15 {
    
    public static void main(String[] args) {
        
        // Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
        // Dicas:
        // Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
        // Triângulo Equilátero: três lados iguais;
        // Triângulo Isósceles: quaisquer dois lados iguais;
        // Triângulo Escaleno: três lados diferentes;
        System.out.println("Digite o primeiro lado: ");
        double lado1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o segundo lado: ");
        double lado2 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o terceiro lado: ");
        double lado3 = new java.util.Scanner(System.in).nextDouble();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }        
    }
}