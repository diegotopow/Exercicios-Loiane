package com.aula16.labs;

public class Ex26 {
    
    public static void main(String[] args) {
        
        // Numa eleição existem três candidatos. Faça um programa que peça o número total
        // de eleitores. Peça para cada eleitor votar e ao final mostrar o número de votos
        // de cada candidato.
        System.out.print("Digite a quantidade de eleitores: ");
        int qtd = new java.util.Scanner(System.in).nextInt();
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o voto do eleitor " + (i + 1) + ": ");
            int voto = new java.util.Scanner(System.in).nextInt();
            if (voto == 1) {
                votos1++;
            } else if (voto == 2) {
                votos2++;
            } else if (voto == 3) {
                votos3++;
            }
        }
        System.out.println("Votos do candidato 1: " + votos1);
        System.out.println("Votos do candidato 2: " + votos2);
        System.out.println("Votos do candidato 3: " + votos3);
    }
}