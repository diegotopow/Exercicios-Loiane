package com.aula13.labs;

public class Ex08 {
    
    public static void main(String[] args) {
        
        //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
        System.out.println("Digite quanto você ganha por hora: ");
        double ganhoHora = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        double horasMes = new java.util.Scanner(System.in).nextDouble();
        double salario = ganhoHora * horasMes;
        System.out.println("Seu salário é de R$ " + salario);
    }
}
