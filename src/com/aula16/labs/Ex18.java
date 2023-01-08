package com.aula16.labs;

public class Ex18 {
    
    public static void main(String[] args) {
        
        // Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
        int menor = 0;
        int maior = 0;
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = new java.util.Scanner(System.in).nextInt();
            if (i == 0) {
                menor = num;
                maior = num;
            } else {
                if (num < menor) {
                    menor = num;
                }
                if (num > maior) {
                    maior = num;
                }
            }
            soma += num;
        }
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
    }
}