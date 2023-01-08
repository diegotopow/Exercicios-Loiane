package com.aula16.labs;

public class Ex27 {
    
    public static void main(String[] args) {
        
        // Faça um programa qye calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.
        System.out.print("Digite a quantidade de turmas: ");
        int qtdTurmas = new java.util.Scanner(System.in).nextInt();
        int qtdAlunos = 0;
        for (int i = 0; i < qtdTurmas; i++) {
            System.out.print("Digite a quantidade de alunos da turma " + (i + 1) + ": ");
            int qtd = new java.util.Scanner(System.in).nextInt();
            qtdAlunos += qtd;
        }
        System.out.println("Média de alunos por turma: " + (qtdAlunos / qtdTurmas));
    }
}