package com.aula15.labs;

public class Ex12 {
    
    public static void main(String[] args) {
        
        //Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
        //Desconto do IR:
        //Salário Bruto até 900 (inclusive) - isento
        //Salário Bruto até 1500 (inclusive) - desconto de 5%
        //Salário Bruto até 2500 (inclusive) - desconto de 10%
        //Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        //Salário Bruto: (5 * 220)        : R$ 1100,00
        //(-) IR (5%)                     : R$   55,00
        //(-) INSS ( 10%)                 : R$  110,00
        //(=) FGTS (11%)                  : R$  121,00
        //( ) Total de descontos          : R$  165,00
        //(=) Salário Liquido             : R$  935,00
        System.out.println("Digite o valor da sua hora: ");
        double valorHora = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = new java.util.Scanner(System.in).nextDouble();
        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = 0;
        double inss = 0.1;
        double fgts = 0.11;
        double totalDescontos = 0;
        double salarioLiquido = 0;
        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            ir = 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            ir = 0.1;
        } else {
            ir = 0.2;
        }
        totalDescontos = salarioBruto * ir + salarioBruto * inss;
        salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhadas + ")   : R$ " + salarioBruto);
        System.out.println("(-) IR (" + ir * 100 + "%)   : R$ " + salarioBruto * ir);
        System.out.println("(-) INSS (" + inss * 100 + "%)   : R$ " + salarioBruto * inss);
        System.out.println("(=) FGTS (" + fgts * 100 + "%)   : R$ " + salarioBruto * fgts);
        System.out.println("( ) Total de descontos   : R$ " + totalDescontos);
        System.out.println("(=) Salário Liquido   : R$ " + salarioLiquido);
    }
}