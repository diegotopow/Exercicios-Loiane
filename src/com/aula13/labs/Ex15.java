package com.aula13.labs;

public class Ex15 {
    
    public static void main(String[] args) {
        
        //  Faça  um  Programa  que  pergunte  quanto  você  ganha  por  hora  e  o  número  de horas trabalhadas no mês.
        //  Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
        //  8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
        //  a) salário bruto.
        //  b) quanto pagou ao INSS.
        //  c) quanto pagou ao sindicato.
        //  d) o salário líquido.
        //  e) calcule os descontos e o salário líquido, conforme a tabela abaixo:
        //  + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
        //  Obs.: Salário Bruto - Descontos = Salário Líquido.
        System.out.println("Digite quanto você ganha por hora: ");
        double ganhoHora = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        double horasMes = new java.util.Scanner(System.in).nextDouble();
        double salarioBruto = ganhoHora * horasMes;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - ir - inss - sindicato;
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("IR (11%): R$ " + ir);
        System.out.println("INSS (8%): R$ " + inss);
        System.out.println("Sindicato (5%): R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);        
    }
}