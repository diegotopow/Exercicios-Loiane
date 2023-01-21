package com.aula20.labs;

public class Ex01 {
    
    public static void main(String[] args) {
        
        // Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o maior
        // número da matriz e a sua posição (linha, coluna).

        int[][] matrizM = new int[4][4];
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
        int maior = matrizM[0][0];
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][j] > maior) {
                    maior = matrizM[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}