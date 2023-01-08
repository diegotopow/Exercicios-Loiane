package com.aula13.labs;

public class Ex18 {
    
    public static void main(String[] args) {
        
        // Façca um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
        // calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
        System.out.println("Digite o tamanho do arquivo para download (em MB): ");
        double tamanho = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite a velocidade do link de Internet (em Mbps): ");
        double velocidade = new java.util.Scanner(System.in).nextDouble();
        double tempo = tamanho / velocidade;
        System.out.println("Tempo aproximado de download do arquivo usando este link (em minutos): " + tempo);
        
    }
}
