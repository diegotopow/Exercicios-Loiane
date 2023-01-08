package com.aula15.labs;

public class Ex04 {
    
    public static void main(String[] args) {
        
        // Faça um programa que verifique se uma letra digitada é vogal ou consoante.
        System.out.println("Digite uma letra: ");
        char letra = new java.util.Scanner(System.in).next().charAt(0);
        if (letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' || letra == 'I' || letra == 'i' || letra == 'O' || letra == 'o' || letra == 'U' || letra == 'u') {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }
}