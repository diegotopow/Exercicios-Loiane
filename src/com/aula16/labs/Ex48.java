package com.aula16.labs;

public class Ex48 {
    
    public static void main(String[] args) {
        
        // Faça um programa que peça um número positivo e em seguida mostre este número invertido.
        // Exemplo:
        // 12376489
        // => 98467321
        int numero = 0;
        int numeroInvertido = 0;
        int resto = 0;
        System.out.println("Digite um número: ");
        numero = new java.util.Scanner(System.in).nextInt();
        while (numero > 0) {
            resto = numero % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            numero = numero / 10;
        }
        System.out.println("Número invertido: " + numeroInvertido);
    }
}