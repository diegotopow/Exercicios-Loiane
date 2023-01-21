package com.aula19.labs;

public class Ex38 {
    
    public static void main(String[] args) {
        
        //  Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo e tamanho, sendo que cada
        // elemento de B deverá ser o seguinte somatório: Bi = Somatório de Aj, para todo j variando de i até 10.

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            int somatorio = 0;
            for (int j = i; j < vetorA.length; j++) {
                somatorio += vetorA[j];
            }
            vetorB[i] = somatorio;
        }
        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}