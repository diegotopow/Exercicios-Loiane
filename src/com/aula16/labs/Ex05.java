package com.aula16.labs;

public class Ex05 {
    
    public static void main(String[] args) {
        
        // Altere o protrama anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
        System.out.println("Digite a população A: ");
        int popA = new java.util.Scanner(System.in).nextInt();
        System.out.println("Digite a população B: ");
        int popB = new java.util.Scanner(System.in).nextInt();
        System.out.println("Digite a taxa de crescimento da população A: ");
        double taxaA = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite a taxa de crescimento da população B: ");
        double taxaB = new java.util.Scanner(System.in).nextDouble();
        int anos = 0;
        while (popA < popB) {
            popA += (popA * taxaA);
            popB += (popB * taxaB);
            anos++;
        }
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Anos: " + anos);
    }
}