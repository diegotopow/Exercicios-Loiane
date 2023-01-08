
package com.aula16.labs;

public class Ex36 {
    
    public static void main(String[] args) {
        
        // Desenvolva  um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo abaixo:
        // Montar a tabuada de: 5
        // Começar por: 4
        // Terminar em: 7
        // Vou montar a tabuada de 5 começando em 4 e terminando em 7:
        // 5 X 4 = 20
        // 5 X 5 = 25
        // 5 X 6 = 30
        // 5 X 7 = 35
        // Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
        System.out.println("Montar a tabuada de: ");
        int tabuada = new java.util.Scanner(System.in).nextInt();
        System.out.println("Começar por: ");
        int inicio = new java.util.Scanner(System.in).nextInt();
        System.out.println("Terminar em: ");
        int fim = new java.util.Scanner(System.in).nextInt();

        System.out.println("Montar a tabuada de: " + tabuada);
        System.out.println("Começar por: " + inicio);
        System.out.println("Terminar em: " + fim);
        System.out.println("Vou montar a tabuada de " + tabuada + ", começando em " + inicio + " e terminando em " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));

        }
    }
}