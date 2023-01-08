package com.aula16.labs;

public class Ex39 {
    
    public static void main(String[] args) {
        
        // Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o número do aluno e o segundo
        // representando a sua altura em centímetros. Encontre o aluno mais alto e o mais baixo. Mostre o número do aluno mais
        // alto e o número do aluno mais baixo, junto com suas alturas.
        int[] alunos = new int[10];
        double[] alturas = new double[10];
        int alunoMaisAlto = 0;
        int alunoMaisBaixo = 0;
        double alturaMaisAlta = 0;
        double alturaMaisBaixa = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número do aluno: ");
            alunos[i] = new java.util.Scanner(System.in).nextInt();
            System.out.println("Digite a altura do aluno: ");
            alturas[i] = new java.util.Scanner(System.in).nextDouble();
            if (i == 0) {
                alunoMaisAlto = alunos[i];
                alunoMaisBaixo = alunos[i];
                alturaMaisAlta = alturas[i];
                alturaMaisBaixa = alturas[i];
            } else {
                if (alturas[i] > alturaMaisAlta) {
                    alunoMaisAlto = alunos[i];
                    alturaMaisAlta = alturas[i];
                }
                if (alturas[i] < alturaMaisBaixa) {
                    alunoMaisBaixo = alunos[i];
                    alturaMaisBaixa = alturas[i];
                }
            }
        }
        System.out.println("O aluno mais alto é o " + alunoMaisAlto + " com " + alturaMaisAlta + " cm.");
        System.out.println("O aluno mais baixo é o " + alunoMaisBaixo + " com " + alturaMaisBaixa + " cm.");
    }
}