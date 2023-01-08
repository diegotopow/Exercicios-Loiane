package com.aula13.labs;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as 4 notas bimestrais: ");
        double nota1 = scan.nextInt();
        double nota2 = scan.nextInt();
        double nota3 = scan.nextInt();
        double nota4 = scan.nextInt();
        double media = ((nota1+nota2+nota3+nota4)/4);
        System.out.println("A média das 4 notas bimestrais é: " + media);
    }
}