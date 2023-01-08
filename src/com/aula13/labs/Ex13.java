package com.aula13.labs;

public class Ex13 {
    
    public static void main(String[] args) {
        
        // Tendo  como  dados  de  entrada  a  altura  de  uma  pessoa,  construa  um algoritmo  que  calcule  seu  peso  ideal,  usando  a  seguinte  fórmula:
        // a. Para homens (72.7*altura) - 58
        // b. Para mulheres (62.1*altura) - 44.7
        // Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
        System.out.println("Digite sua altura: ");
        double altura = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Digite seu sexo (M ou F): ");
        String sexo = new java.util.Scanner(System.in).next();
        double pesoIdeal = 0;
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal=(72.7*altura)-58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal=(62.1*altura)-44.7;
        }
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}