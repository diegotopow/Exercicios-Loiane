package com.aula15.labs;

public class Ex16 {
    
    public static void main(String[] args) {
        
        // Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
        // Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
        // Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
        // Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
        // Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
        System.out.println("Digite o valor de A: ");
        double a = new java.util.Scanner(System.in).nextDouble();
        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
        } else {
            System.out.println("Digite o valor de B: ");
            double b = new java.util.Scanner(System.in).nextDouble();
            System.out.println("Digite o valor de C: ");
            double c = new java.util.Scanner(System.in).nextDouble();
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("A equação possui apenas uma raiz real: " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
            }
        }        
    }
}