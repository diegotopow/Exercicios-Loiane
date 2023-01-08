package com.aula16.labs;

public class Ex03 {
    
    public static void main(String[] args) {
        
        // Faça um programa que leia e valide as seguintes informações:
        // a. Nome: maior que 3 caracteres;
        // b. Idade: entre 0 e 150;
        // c. Salário: maior que zero;
        // d. Sexo: 'f' ou 'm';
        // e. Estado Civil: 's', 'c', 'v', 'd';
        System.out.println("Digite seu nome: ");
        String nome = new java.util.Scanner(System.in).nextLine();
        while (nome.length() < 3) {
            System.out.println("Nome inválido!");
            System.out.println("Digite seu nome: ");
            nome = new java.util.Scanner(System.in).nextLine();
        }
        System.out.println("Digite sua idade: ");
        int idade = new java.util.Scanner(System.in).nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade inválida!");
            System.out.println("Digite sua idade: ");
            idade = new java.util.Scanner(System.in).nextInt();
        }
        System.out.println("Digite seu salário: ");
        double salario = new java.util.Scanner(System.in).nextDouble();
        while (salario < 0) {
            System.out.println("Salário inválido!");
            System.out.println("Digite seu salário: ");
            salario = new java.util.Scanner(System.in).nextDouble();
        }
        System.out.println("Digite seu sexo: ");
        String sexo = new java.util.Scanner(System.in).nextLine();
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Sexo inválido!");
            System.out.println("Digite seu sexo: ");
            sexo = new java.util.Scanner(System.in).nextLine();
        }
        System.out.println("Digite seu estado civil: ");
        String estadoCivil = new java.util.Scanner(System.in).nextLine();
        while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
            System.out.println("Estado civil inválido!");
            System.out.println("Digite seu estado civil: ");
            estadoCivil = new java.util.Scanner(System.in).nextLine();
        }
        System.out.println("Informações válidas!");
    }
}