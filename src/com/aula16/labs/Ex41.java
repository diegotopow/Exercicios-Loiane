package com.aula16.labs;

public class Ex41 {
    
    public static void main(String[] args) {
        
        // Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes 
        //dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
        //Os juros e a quantidade de parcelas seguem a tabela abaixo:
        //Quantidade de Parcelas    % de Juros sobre o valor inicial da dívida
        //          1                    0
        //          3                    10
        //          6                    15
        //          9                    20
        //          12                   25
        // Exemplo de saída do programa:
        // Valor da Dívida    Valor dos Juros     Quantidade de Parcelas      Valor da Parcela
        // R$ 1.000,00            0                      1                       R$ 1.000,00
        // R$ 1.100,00           100                     3                       R$ 366,00
        // R$ 1.150,00           150                     6                       R$ 191,67
        double valorDivida = 0;
        double valorJuros = 0;
        int quantidadeParcelas = 0;
        double valorParcela = 0;
        System.out.println("Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela");
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                valorDivida = 1000;
                valorJuros = 0;
                quantidadeParcelas = 1;
                valorParcela = valorDivida;
            } else if (i == 1) {
                valorDivida = 1100;
                valorJuros = 100;
                quantidadeParcelas = 3;
                valorParcela = valorDivida / quantidadeParcelas;
            } else if (i == 2) {
                valorDivida = 1150;
                valorJuros = 150;
                quantidadeParcelas = 6;
                valorParcela = valorDivida / quantidadeParcelas;
            } else if (i == 3) {
                valorDivida = 1200;
                valorJuros = 200;
                quantidadeParcelas = 9;
                valorParcela = valorDivida / quantidadeParcelas;
            } else if (i == 4) {
                valorDivida = 1250;
                valorJuros = 250;
                quantidadeParcelas = 12;
                valorParcela = valorDivida / quantidadeParcelas;
            }
            System.out.println("R$ " + valorDivida + " " + valorJuros + " " + quantidadeParcelas + " R$ " + valorParcela);
        }
    }
}