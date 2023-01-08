package com.aula13.labs;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        
        //Faça um Programa que converta metros para centímetros.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros: ");
        double metros = scan.nextDouble();
        double centimetros = metros * 100;
        System.out.println(metros + " metros é igual a " + centimetros + " centímetros.");
    }
}
