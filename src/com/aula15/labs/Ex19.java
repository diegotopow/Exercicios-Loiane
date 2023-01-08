package com.aula15.labs;

public class Ex19 {
    
    public static void main(String[] args) {
        
        // Faça um programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
        // Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
        // 326 = 3 centenas, 2 dezenas e 6 unidades
        // 12 = 1 dezena e 2 unidades
        // Testar com: 326, 300, 100, 320, 310, 305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
        System.out.println("Digite um número inteiro menor que 1000: ");
        int numero = new java.util.Scanner(System.in).nextInt();
        if (numero < 1000) {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = (numero % 100) % 10;
            if (centenas > 0) {
                System.out.print(centenas + " centena");
                if (centenas > 1) {
                    System.out.print("s");
                }
                if (dezenas > 0 || unidades > 0) {
                    System.out.print(", ");
                }
            }
            if (dezenas > 0) {
                System.out.print(dezenas + " dezena");
                if (dezenas > 1) {
                    System.out.print("s");
                }
                if (unidades > 0) {
                    System.out.print(" e ");
                }
            }
            if (unidades > 0) {
                System.out.print(unidades + " unidade");
                if (unidades > 1) {
                    System.out.print("s");
                }
            }
            System.out.println(".");
        } else {
            System.out.println("Número inválido.");
        }        
    }
}