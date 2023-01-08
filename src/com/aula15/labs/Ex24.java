package com.aula15.labs;

public class Ex24 {
    
    public static void main(String[] args) {
        
        // Faça um programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
        // par ou ímpar;
        // positivo ou negativo;
        // inteiro ou decimal.
        System.out.println("Digite o primeiro número: ");
        double numero1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite a operação que deseja realizar (+, -, *, /): ");
        String operacao = new java.util.Scanner(System.in).next();
        double resultado = 0;
        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        System.out.println("Resultado: " + resultado);
        if (resultado == Math.round(resultado)) {
            System.out.println("Número inteiro.");
        } else {
            System.out.println("Número decimal.");
        }
        if (resultado % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
        if (resultado >= 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }        
    }
}
