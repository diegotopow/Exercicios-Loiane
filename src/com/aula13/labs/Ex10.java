package com.aula13.labs;

public class Ex10 {
    
    public static void main(String[] args) {
        
        //Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = new java.util.Scanner(System.in).nextDouble();
        double farenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + " graus Celsius é igual a " + farenheit + " graus Farenheit.");

    }
}