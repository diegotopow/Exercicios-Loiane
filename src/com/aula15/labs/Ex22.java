package com.aula15.labs;

public class Ex22 {
    
    public static void main(String[] args) {
        
        //Faça um programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão).
        System.out.println("Digite um número inteiro: ");
        int numero = new java.util.Scanner(System.in).nextInt();
        if (numero % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }        
    }
}