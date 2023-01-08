
package com.aula16.labs;

public class Ex23 {
    
    public static void main(String[] args) {
        
        // Faça um programa qye mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos. Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.
        System.out.print("Digite um número: ");
        int num = new java.util.Scanner(System.in).nextInt();
        int divisoes = 0;
        for (int i = 2; i <= num; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    divisoes++;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
        System.out.println("Divisões: " + divisoes);
    }
}