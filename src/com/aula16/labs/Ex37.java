package com.aula16.labs;

public class Ex37 {
    
    public static void main(String[] args) {
        
        // Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais 
        //baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que pergunte a 
        //cada um dos clientes da academia seu código, sua altura e seu peso. O final da digitação 
        //de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao encerrar o 
        //programa também deve ser informados os códigos e valores do clente mais alto, do mais 
        //baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos clientes.

        int codigo = 0;
        double altura = 0;
        double peso = 0;
        double maiorAltura = 0;
        double menorAltura = 0;
        double maiorPeso = 0;
        double menorPeso = 0;
        double somaAltura = 0;
        double somaPeso = 0;
        int contador = 0;
        double mediaAltura = 0;
        double mediaPeso = 0;
        int codigoMaiorAltura = 0;
        int codigoMenorAltura = 0;
        int codigoMaiorPeso = 0;
        int codigoMenorPeso = 0;
        do {
            System.out.print("Digite o código do cliente: ");
            codigo = new java.util.Scanner(System.in).nextInt();
            if (codigo != 0) {
                System.out.print("Digite a altura do cliente: ");
                altura = new java.util.Scanner(System.in).nextDouble();
                System.out.print("Digite o peso do cliente: ");
                peso = new java.util.Scanner(System.in).nextDouble();
                if (contador == 0) {
                    maiorAltura = altura;
                    menorAltura = altura;
                    maiorPeso = peso;
                    menorPeso = peso;
                    codigoMaiorAltura = codigo;
                    codigoMenorAltura = codigo;
                    codigoMaiorPeso = codigo;
                    codigoMenorPeso = codigo;
                } else {
                    if (altura > maiorAltura) {
                        maiorAltura = altura;
                        codigoMaiorAltura = codigo;
                    }
                    if (altura < menorAltura) {
                        menorAltura = altura;
                        codigoMenorAltura = codigo;
                    }
                    if (peso > maiorPeso) {
                        maiorPeso = peso;
                        codigoMaiorPeso = codigo;
                    }
                    if (peso < menorPeso) {
                        menorPeso = peso;
                        codigoMenorPeso = codigo;
                    }
                }
                somaAltura += altura;
                somaPeso += peso;
                contador++;
            }
        } while (codigo != 0);
        mediaAltura = somaAltura / contador;
        mediaPeso = somaPeso / contador;
        System.out.println("O cliente com maior altura é o código " + codigoMaiorAltura + " com " + maiorAltura + " cm.");
        System.out.println("O cliente com menor altura é o código " + codigoMenorAltura + " com " + menorAltura + " cm.");
        System.out.println("O cliente com maior peso é o código " + codigoMaiorPeso + " com " + maiorPeso + " kg.");
        System.out.println("O cliente com menor peso é o código " + codigoMenorPeso + " com " + menorPeso + " kg.");
        System.out.println("A média de altura dos clientes é " + mediaAltura + " cm.");
        System.out.println("A média de peso dos clientes é " + mediaPeso + " kg.");
    }
}