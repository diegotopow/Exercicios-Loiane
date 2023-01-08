package com.aula15.labs;

public class Ex25 {
    
    public static void main(String[] args) {
        
        // Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        // "Telefonou para a vítima?"
        // "Esteve no local do crime?"
        // "Mora perto da vítima?"
        // "Devia para a vítima?"
        // "Já trabalhou com a vítima?"
        // O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
        System.out.println("Telefonou para a vítima? (S/N)");
        String resposta1 = new java.util.Scanner(System.in).next();
        System.out.println("Esteve no local do crime? (S/N)");
        String resposta2 = new java.util.Scanner(System.in).next();
        System.out.println("Mora perto da vítima? (S/N)");
        String resposta3 = new java.util.Scanner(System.in).next();
        System.out.println("Devia para a vítima? (S/N)");
        String resposta4 = new java.util.Scanner(System.in).next();
        System.out.println("Já trabalhou com a vítima? (S/N)");
        String resposta5 = new java.util.Scanner(System.in).next();
        int contador = 0;
        if (resposta1.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta2.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta3.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta4.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta5.equalsIgnoreCase("S")) {
            contador++;
        }
        switch (contador) {
            case 2:
                System.out.println("Suspeita.");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice.");
                break;
            case 5:
                System.out.println("Assassino.");
                break;
            default:
                System.out.println("Inocente.");
                break;
        }        
    }
}