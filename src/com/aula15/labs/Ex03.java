package com.aula15.labs;

public class Ex03 {

    public static void main(String[] args) {
        
        // Faça  um  Programa  que  verifique  se  uma  letra  digitada  é  "F"  ou  "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
        System.out.println("Digite uma letra: ");
        char letra = new java.util.Scanner(System.in).next().charAt(0);
        if (letra == 'F' || letra == 'f') {
            System.out.println("F - Feminino");
        } else if (letra == 'M' || letra == 'm') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }
}