package com.aula16.labs;

public class Ex28 {
    
    public static void main(String[] args) {
        
        // Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.
        System.out.print("Digite a quantidade de CDs: ");
        int qtd = new java.util.Scanner(System.in).nextInt();
        double soma = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o valor do CD " + (i + 1) + ": ");
            double valor = new java.util.Scanner(System.in).nextDouble();
            soma += valor;
        }
        System.out.println("Valor total investido: " + soma);
        System.out.println("Valor médio gasto em cada CD: " + (soma / qtd));
    }
}