package com.aula20.labs;

public class Ex03 {
    
    public static void main(String[] args) {
        
        // Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a
        // matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares.

        int[][] matrizM = new int[3][3];
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
        int qtdPares = 0;
        int qtdImpares = 0;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }
        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);
    }
}