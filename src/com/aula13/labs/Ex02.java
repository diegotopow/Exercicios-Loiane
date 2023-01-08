package com.aula13.labs;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        //Faça um Programa que peça um número e então mostre a mensagem: 'O número informado foi [número]'.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        String numero = scan.nextLine();
        System.out.println("O número informado foi: " + numero);
    
    }
}
