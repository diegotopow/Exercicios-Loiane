package com.aula15.labs;

public class Ex26 {
    
    public static void main(String[] args) {
        
        // Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        // Álcool:
        // até 20 litros, desconto de 3% por litro
        // acima de 20 litros, desconto de 5% por litro
        // Gasolina:
        // até 20 litros, desconto de 4% por litro
        // acima de 20 litros, desconto de 6% por litro
        // Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
        System.out.println("Digite o número de litros vendidos: ");
        double litros = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        String combustivel = new java.util.Scanner(System.in).next();
        double valor = 0;
        switch (combustivel) {
            case "A":
                if (litros <= 20) {
                    valor = litros * 1.90 * 0.97;
                } else {
                    valor = litros * 1.90 * 0.95;
                }
                break;
            case "G":
                if (litros <= 20) {
                    valor = litros * 2.50 * 0.96;
                } else {
                    valor = litros * 2.50 * 0.94;
                }
                break;
            default:
                System.out.println("Combustível inválido.");
                break;
        }
        System.out.println("Valor a ser pago: " + valor);
    }
}