package com.aula16.labs;

public class Ex12 {
    
    public static void main(String[] args) {
        
        // Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
        // Tabuada de 5:
        // 5 X 1 = 5
        // 5 X 2 = 10
        // ...
        // 5 X 10 = 50
        System.out.print("Digite um número: ");
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.println("Tabuada de " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}