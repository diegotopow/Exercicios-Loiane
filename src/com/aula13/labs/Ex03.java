package com.aula13.labs;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        
        //Faça um Programa que peça dois números e imprima a soma.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois números (A e B): ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos números digitados é: " + soma);
    }
}