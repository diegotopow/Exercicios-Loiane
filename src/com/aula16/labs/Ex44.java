package com.aula16.labs;

public class Ex44 {
    
    public static void main(String[] args) {
        
        // Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código.
        // Os códigos utilizados são:
        // 1 , 2, 3, 4  - Votos para os respectivos candidatos
        // (você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
        // 5 - Voto Nulo
        // 6 - Voto em Branco
        // Faça um programa que calcule e mostre:
        // O total de votos para cada candidato;
        // O total de votos nulos;
        // O total de votos em branco;
        // A percentagem de votos nulos sobre o total de votos;
        // A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos tem-se o valor zero.
        int codigo = 0;
        int votosJose = 0;
        int votosJoao = 0;
        int votosMaria = 0;
        int votosPedro = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;
        do {
            System.out.println("Digite o código do candidato: ");
            codigo = new java.util.Scanner(System.in).nextInt();
            switch (codigo) {
                case 1:
                    votosJose++;
                    break;
                case 2:
                    votosJoao++;
                    break;
                case 3:
                    votosMaria++;
                    break;
                case 4:
                    votosPedro++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Código inválido.");
                    break;
            }
            /*if(totalVotos ==0 && codigo == 0)
                totalVotos--;
                System.out.println("Não houve votos.");*/
            totalVotos++;
        } while (codigo != 0);
        System.out.println("O total de votos para José é: " + votosJose + ".");
        System.out.println("O total de votos para João é: " + votosJoao + ".");
        System.out.println("O total de votos para Maria é: " + votosMaria + ".");
        System.out.println("O total de votos para Pedro é: " + votosPedro + ".");
        System.out.println("O total de votos nulos é: " + votosNulos + ".");
        System.out.println("O total de votos em branco é: " + votosBrancos + ".");
        System.out.println("O total de votos é: " + totalVotos + ".");
        System.out.println("A porcentagem de votos nulos é: " + (votosNulos * 100 / totalVotos) + "%.");
        System.out.println("A porcentagem de votos em branco é: " + (votosBrancos * 100 / totalVotos) + "%.");
    }
}