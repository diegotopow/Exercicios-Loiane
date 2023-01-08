package com.aula15.labs;

public class Ex28 {
    
    public static void main(String[] args) {
        
        // O hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
        //                      Até 5 Kg       Acima de 5 Kg
        // File Duplo      R$ 4,90 por Kg     R$ 5,80 por Kg
        // Alcatra         R$ 5,90 por Kg     R$ 6,80 por Kg
        // Picanha         R$ 6,90 por Kg     R$ 7,80 por Kg
        // Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
        System.out.println("Digite o tipo de carne (F-file duplo, A-alcatra, P-picanha): ");
        String carne = new java.util.Scanner(System.in).next();
        System.out.println("Digite a quantidade (em Kg) de carne: ");
        double quantidade = new java.util.Scanner(System.in).nextDouble();
        double valor = 0;
        switch (carne) {
            case "F":
                if (quantidade <= 5) {
                    valor += quantidade * 4.90;
                } else {
                    valor += quantidade * 5.80;
                }
                break;
            case "A":
                if (quantidade <= 5) {
                    valor += quantidade * 5.90;
                } else {
                    valor += quantidade * 6.80;
                }
                break;
            case "P":
                if (quantidade <= 5) {
                    valor += quantidade * 6.90;
                } else {
                    valor += quantidade * 7.80;
                }
                break;
            default:
                System.out.println("Tipo de carne inválido!");
                System.exit(0);
        }
        System.out.println("Digite o tipo de pagamento (C-cartão Tabajara, D-dinheiro): ");
        String pagamento = new java.util.Scanner(System.in).next();
        double desconto = 0;
        if (pagamento.equals("C")) {
            desconto = valor * 0.05;
        }
        System.out.println("Tipo de carne: " + carne);
        System.out.println("Quantidade (em Kg): " + quantidade);
        System.out.println("Preço total: " + valor);
        System.out.println("Tipo de pagamento: " + pagamento);
        System.out.println("Valor do desconto: " + desconto);
        System.out.println("Valor a pagar: " + (valor - desconto));
    }
}
