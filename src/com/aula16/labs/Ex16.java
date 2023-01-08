package com.aula16.labs;

public class Ex16 {
    
    public static void main(String[] args) {
        
        // A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até que o valor seja maior que 500.
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        while (c <= 500) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}