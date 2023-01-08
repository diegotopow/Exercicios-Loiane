package com.aula16.labs;

public class Ex43 {
    
    public static void main(String[] args) {
        
        // O cardápio de uma lanchonete é o seguinte:
        // Especificação    Código      Preço
        // Cachorro Quente  100         R$ 1,20
        // Bauru Simples    101         R$ 1,30
        // Bauru com Ovo    102         R$ 1,50
        // Hambúrguer       103         R$ 1,20
        // Cheeseburguer    104         R$ 1,30
        // Refrigerante     105         R$ 1,00
        // Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
        // Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido.
        // Considere que o cliente deve informar quando o pedido deve ser encerrado.
        int codigo = 0;
        int quantidade = 0;
        double valor = 0;
        double total = 0;
        do {
            System.out.println("Digite o código do produto: ");
            codigo = new java.util.Scanner(System.in).nextInt();
            System.out.println("Digite a quantidade: ");
            quantidade = new java.util.Scanner(System.in).nextInt();
            switch (codigo) {
                case 100:
                    valor = 1.20;
                    break;
                case 101:
                    valor = 1.30;
                    break;
                case 102:
                    valor = 1.50;
                    break;
                case 103:
                    valor = 1.20;
                    break;
                case 104:
                    valor = 1.30;
                    break;
                case 105:
                    valor = 1.00;
                    break;
                default:
                    System.out.println("Código inválido.");
                    break;
            }
            total += valor * quantidade;
        } while (codigo != 0);
        System.out.println("O total do pedido é R$ " + total + ".");
    }
}