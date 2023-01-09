package com.aula19.labs;

public class Ex19 {
    
    public static void main(String[] args) {
        
        // Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em
        // dois vetores “Nota1” e “Nota2” do tipo real. Escreva um programa que calcule a média aritmética
        // simples das notas informadas armazenando o resultado em um vetor “Result” de mesmo tipo e
        // tamanho. Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for
        // superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];
        String[] situacao = new String[10];
        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Digite a primeira nota do aluno " + (i + 1) + ": ");
            nota1[i] = new java.util.Scanner(System.in).nextDouble();
            System.out.println("Digite a segunda nota do aluno " + (i + 1) + ": ");
            nota2[i] = new java.util.Scanner(System.in).nextDouble();
            result[i] = (nota1[i] + nota2[i]) / 2;
            if (result[i] >= 7) {
                situacao[i] = "Aprovado";
            } else {
                situacao[i] = "Reprovado";
            }
        }
        System.out.println("Aluno\tNota 1\tNota 2\tMédia\tSituação");
        for (int i = 0; i < nota1.length; i++) {
            System.out.println((i + 1) + "\t" + nota1[i] + "\t" + nota2[i] + "\t" + result[i] + "\t" + situacao[i]);
        }
    }
}