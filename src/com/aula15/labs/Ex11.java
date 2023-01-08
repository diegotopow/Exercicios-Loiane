package com.aula15.labs;

public class Ex11 {
    
    public static void main(String[] args) {
        
        // As organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
        // Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
        // salários até R$ 280,00 (incluindo) : aumento de 20%
        // salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        // salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        // salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
        // o salário antes do reajuste;
        // o percentual de aumento aplicado;
        // o valor do aumento;
        // o novo salário, após o aumento.
        System.out.println("Digite o salário do colaborador: ");
        double salario = new java.util.Scanner(System.in).nextDouble();
        double percentual = 0;
        double aumento = 0;
        double novoSalario = 0;
        if (salario <= 280) {
            percentual = 0.2;
            aumento = salario * percentual;
            novoSalario = salario + aumento;
        } else if (salario > 280 && salario <= 700) {
            percentual = 0.15;
            aumento = salario * percentual;
            novoSalario = salario + aumento;
        } else if (salario > 700 && salario <= 1500) {
            percentual = 0.1;
            aumento = salario * percentual;
            novoSalario = salario + aumento;
        } else {
            percentual = 0.05;
            aumento = salario * percentual;
            novoSalario = salario + aumento;
        }
        System.out.println("Salário antes do reajuste: " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual);
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salário, após o aumento: " + novoSalario);
    }
}