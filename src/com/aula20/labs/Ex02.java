package com.aula20.labs;

public class Ex02 {
    
    public static void main(String[] args) {
        
        //  Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o
        // maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.

        int[][] matrizM = new int[10][10];
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = (int)Math.round(Math.random() * 9);
            }
        }
        System.out.println("Matriz M: ");
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println();
        }
        int maiorLinha5 = matrizM[4][0];
        int menorLinha5 = matrizM[4][0];
        int maiorColuna7 = matrizM[0][6];
        int menorColuna7 = matrizM[0][6];
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (i == 4) {
                    if (matrizM[i][j] > maiorLinha5) {
                        maiorLinha5 = matrizM[i][j];
                    }
                    if (matrizM[i][j] < menorLinha5) {
                        menorLinha5 = matrizM[i][j];
                    }
                }
                if (j == 6) {
                    if (matrizM[i][j] > maiorColuna7) {
                        maiorColuna7 = matrizM[i][j];
                    }
                    if (matrizM[i][j] < menorColuna7) {
                        menorColuna7 = matrizM[i][j];
                    }
                }
            }
        }
        System.out.println("Maior valor da linha 5: " + maiorLinha5);
        System.out.println("Menor valor da linha 5: " + menorLinha5);
        System.out.println("Maior valor da coluna 7: " + maiorColuna7);
        System.out.println("Menor valor da coluna 7: " + menorColuna7);
    }
}