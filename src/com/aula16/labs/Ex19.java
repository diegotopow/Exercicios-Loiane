package com.aula16.labs;

public class Ex19 {
    
    public static void main(String[] args) {
        
        // Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
        int menor = 0;
        int maior = 0;
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num < 0 || num > 1000) {
                System.out.println("Número inválido!");
                i--;
                continue;
            }
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