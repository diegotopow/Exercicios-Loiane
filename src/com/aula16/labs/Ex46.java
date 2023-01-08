package com.aula16.labs;

public class Ex46 {
    
    public static void main(String[] args) {
        
        // Em uma competição de salto em distância cada atleta tem direito a cinco saltos. No final 
        //da série de saltos de cada atleta, o melhor e o pior resultados são eliminados. O seu 
        //resultado fica sendo a média dos três valores restantes. Você deve fazer um programa que 
        //receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe 
        //a média dos saltos conforme a descrição acima informada (retirar o melhor e o pior salto e 
        //depois calcular a média). Faça uso de uma lista para armazenar os saltos. Os saltos são 
        //informados na ordem da execução, portanto não são ordenados. O programa deve ser encerrado 
        //quando não for informado o nome do atleta. A saída do programa deve ser conforme o exemplo 
        //abaixo:
        // Atleta: Rodrigo Curvêllo
        // Primeiro salto: 6.5 m
        // Segundo salto: 6.1 m
        // Terceiro salto: 6.2 m
        // Quarto salto: 5.4 m
        // Quinto salto: 5.3 m
        // Melhor salto:  6.5 m
        // Pior salto: 5.3 m
        // Média dos demais saltos: 5.9 m
        // Resultado final:
        // Rodrigo Curvêllo: 5.9 m
        String nomeAtleta = "";
        double[] saltos = new double[5];
        double melhorSalto = 0;
        double piorSalto = 0;
        double mediaSaltos = 0;
        int totalSaltos = 0;
        int continuar = 0;
        do {
            System.out.println("Digite o nome do atleta: ");
            nomeAtleta = new java.util.Scanner(System.in).next();
            if (nomeAtleta.equalsIgnoreCase("sair")) {
                break;
            }
            for (int i = 0; i < saltos.length; i++) {
                System.out.println("Digite o " + (i + 1) + "º salto: ");
                saltos[i] = new java.util.Scanner(System.in).nextDouble();
                totalSaltos++;
            }
            melhorSalto = saltos[0];
            piorSalto = saltos[0];
            for (int i = 0; i < saltos.length; i++) {
                if (saltos[i] > melhorSalto) {
                    melhorSalto = saltos[i];
                }
                if (saltos[i] < piorSalto) {
                    piorSalto = saltos[i];
                }
            }
            for (int i = 0; i < saltos.length; i++) {
                if (saltos[i] != melhorSalto && saltos[i] != piorSalto) {
                    mediaSaltos += saltos[i];
                }
            }
            mediaSaltos = mediaSaltos / 3;
            System.out.println("Atleta: " + nomeAtleta);
            for (int i = 0; i < saltos.length; i++) {
                System.out.println("Salto " + (i + 1) + ": " + saltos[i] + " m");
            }
            System.out.println("Melhor salto: " + melhorSalto + " m");
            System.out.println("Pior salto: " + piorSalto + " m");
            System.out.println("Média dos demais saltos: " + mediaSaltos + " m");
            System.out.println("Resultado final:");
            System.out.println(nomeAtleta + ": " + mediaSaltos + " m");
            System.out.println("Deseja continuar? 1 - Sim / 2 - Não");
            continuar = new java.util.Scanner(System.in).nextInt();
        } while (continuar == 1);
    }
}