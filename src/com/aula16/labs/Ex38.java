package com.aula16.labs;

public class Ex38 {
    
    public static void main(String[] args) {
        
        // Um funcionario de uma empresa recebe aumento salarial anualmente: Sabe-se que:
        // Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
        // Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
        // A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.
        // Faça um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo
        // que o usuário digite o salário inicial do funcionário.
        System.out.println("Digite o salário inicial do funcionário: ");
        double salario = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o percentual de aumento do funcionário: ");
        double aumento = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o salário atual: ");
        double salarioAtual = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite o ano inicial: ");
        int ano = new java.util.Scanner(System.in).nextInt();
        do {
            if (ano == 1995) {
                salarioAtual = salario;
            } else {
                aumento = aumento * 2;
                salarioAtual = salarioAtual + (salarioAtual * aumento / 100);
            }
            System.out.println("Salário do ano " + ano + ": R$ " + salarioAtual);
            ano++;
        } while (ano <= 2015);
    }
}