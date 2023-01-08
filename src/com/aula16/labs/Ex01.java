package com.aula16.labs;

public class Ex01 {
    
    public static void main(String[] args) {
        
        // Faça um programa que peça uma nota entre 0 e 10. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
        System.out.println("Digite uma nota entre 0 e 10: ");
        double nota = new java.util.Scanner(System.in).nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = new java.util.Scanner(System.in).nextDouble();
        }
        System.out.println("Nota válida: " + nota);
    }
}
