package com.aula15.labs;

public class Ex08 {
    
    public static void main(String[] args) {
        
        // Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
        System.out.println("Digite o preço do primeiro produto: ");
        double preco1 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o preço do segundo produto: ");
        double preco2 = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o preço do terceiro produto: ");
        double preco3 = new java.util.Scanner(System.in).nextDouble();
        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Você deve comprar o primeiro produto. R$ " + preco1 + " é o menor preço.");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Você deve comprar o segundo produto. R$ " + preco2 + " é o menor preço.");
        } else {
            System.out.println("Você deve comprar o terceiro produto. R$ " + preco3 + " é o menor preço.");
        }
    }
}