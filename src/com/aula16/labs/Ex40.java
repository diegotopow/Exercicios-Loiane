package com.aula16.labs;

public class Ex40 {
    
    public static void main(String[] args) {
        
        // Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes 
        //de trânsito. Foram obtidos os seguintes dados:
        //a. Código da cidade;
        //b. Número de veículos de passeio (em 1999);
        //c. Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
        //d. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
        //e. Qual a média de veículos nas cinco cidades juntas;
        //f. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
        int[] codigos = new int[5];
        int[] veiculos = new int[5];
        int[] acidentes = new int[5];
        int maiorIndice = 0;
        int menorIndice = 0;
        int maiorIndiceCidade = 0;
        int menorIndiceCidade = 0;
        int somaVeiculos = 0;
        int somaAcidentes = 0;
        double mediaVeiculos = 0;
        double mediaAcidentes = 0;
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o código da cidade: ");
            codigos[i] = new java.util.Scanner(System.in).nextInt();
            System.out.println("Digite o número de veículos de passeio: ");
            veiculos[i] = new java.util.Scanner(System.in).nextInt();
            System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
            acidentes[i] = new java.util.Scanner(System.in).nextInt();
            if (i == 0) {
                maiorIndice = acidentes[i];
                menorIndice = acidentes[i];
                maiorIndiceCidade = codigos[i];
                menorIndiceCidade = codigos[i];
            } else {
                if (acidentes[i] > maiorIndice) {
                    maiorIndice = acidentes[i];
                    maiorIndiceCidade = codigos[i];
                }
                if (acidentes[i] < menorIndice) {
                    menorIndice = acidentes[i];
                    menorIndiceCidade = codigos[i];
                }
            }
            somaVeiculos += veiculos[i];
            somaAcidentes += acidentes[i];
            if (veiculos[i] < 2000) {
                contador++;
            }
        }
        mediaVeiculos = somaVeiculos / 5;
        mediaAcidentes = somaAcidentes / contador;
        System.out.println("O maior índice de acidentes de trânsito é " + maiorIndice + " e a cidade é " + maiorIndiceCidade + ".");
        System.out.println("O menor índice de acidentes de trânsito é " + menorIndice + " e a cidade é " + menorIndiceCidade + ".");
        System.out.println("A média de veículos nas cinco cidades juntas é " + mediaVeiculos + ".");
        System.out.println("A média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é " + mediaAcidentes + ".");
    }
}