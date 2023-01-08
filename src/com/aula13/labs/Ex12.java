package com.aula13.labs;

public class Ex12 {

    public static void main(String[] args) {
        
        // Tendo  como  dados  de  entrada  a  altura  de  uma  pessoa,  construa  um algoritmo  que  calcule  seu  peso  ideal,  usando  a  seguinte  fórmula:
        // (72.7*altura) - 58
        System.out.println("Digite sua altura: ");
        double altura = new java.util.Scanner(System.in).nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}