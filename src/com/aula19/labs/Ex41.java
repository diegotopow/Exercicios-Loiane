package com.aula19.labs;

public class Ex41 {
    
    public static void main(String[] args) {
        
        //  Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca, para pesquisar se um dado
        // elemento X está armazenado em A.

        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        int x = (int)Math.round(Math.random() * 10);
        System.out.println("Valor de X: " + x);
        boolean achou = false;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == x) {
                achou = true;
                break;
            }
        }
        if (achou) {
            System.out.println("Valor encontrado!");
        } else {
            System.out.println("Valor não encontrado!");
        }
    }
}