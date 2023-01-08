package com.aula16.labs;

public class Ex33 {
    
    public static void main(String[] args) {
        
        // O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.
        //
        //
        double menor = 0;
        double maior = 0;
        double media = 0;
        double soma = 0;
        int contador = 0;
        while (true) {
            System.out.print("Digite uma temperatura: ");
            double temperatura = new java.util.Scanner(System.in).nextDouble();
            if (temperatura == 0) {
                break;
            }
            if (contador == 0) {
                menor = temperatura;
                maior = temperatura;
            }
            if (temperatura < menor) {
                menor = temperatura;
            }
            if (temperatura > maior) {
                maior = temperatura;
            }
            soma += temperatura;
            contador++;
        }
        media = soma / contador;
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Média das temperaturas: " + media);
    }
}