package com.aula13.labs;

public class Ex16 {
    
    public static void main(String[] args) {
        
        // Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
        // Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18
        // litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
        // Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        // comprar apenas latas de 18 litros;
        // comprar apenas galões de 3,6 litros;
        // misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% de folga e sempre arredonde os valores para cima,
        // isto é, considere latas cheias.
        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = new java.util.Scanner(System.in).nextDouble();
        double litros = area / 6;
        double latas = Math.ceil(litros / 18);
        double galoes = Math.ceil(litros / 3.6);
        double precoLatas = latas * 80;
        double precoGaloes = galoes * 25;
        double precoLatasGaloes = Math.ceil(litros / 21.6) * 80;
        System.out.println("Latas: " + latas + ", Preço: R$ " + precoLatas);
        System.out.println("Galões: " + galoes + ", Preço: R$ " + precoGaloes);
        System.out.println("Latas e Galões: " + Math.ceil(litros / 21.6) + ", Preço: R$ " + precoLatasGaloes);
    }
}