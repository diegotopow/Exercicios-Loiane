package com.aula15.labs;

public class Ex27 {
    
    public static void main(String[] args) {
        
        // Uma fruteira está vendendo frutas com a seguinte tabela de preços:
        // Até 5 Kg                         Acima de 5 Kg
        // Morango  R$ 2,50 por Kg          R$ 2,20 por Kg
        // Maçã     R$ 1,80 por Kg          R$ 1,50 por Kg
        // Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
        // Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
        System.out.println("Digite a quantidade (em Kg) de morangos: ");
        double morangos = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite a quantidade (em Kg) de maças: ");
        double macas = new java.util.Scanner(System.in).nextDouble();
        double valor = 0;
        if (morangos <= 5) {
            valor += morangos * 2.50;
        } else {
            valor += morangos * 2.20;
        }
        if (macas <= 5) {
            valor += macas * 1.80;
        } else {
            valor += macas * 1.50;
        }
        if (morangos + macas > 8 || valor > 25) {
            valor *= 0.90;
        }
        System.out.println("Valor a ser pago: " + valor);
    }
}