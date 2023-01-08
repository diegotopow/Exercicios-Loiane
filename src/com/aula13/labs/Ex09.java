package com.aula13.labs;

public class Ex09 {
    
    public static void main(String[] args) {
        
        //Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
        //C = (5 * (F-32) / 9).
        System.out.println("Digite a temperatura em graus Farenheit: ");
        double farenheit = new java.util.Scanner(System.in).nextDouble();
        double celsius = (5 * (farenheit - 32) / 9);
        System.out.println("A temperatura em graus Celsius é: " + celsius);
    }
}