package com.aula15.labs;

public class Ex10 {
    
    public static void main(String[] args) {
        
        // Faça um programa que pergunte em qe turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
        System.out.println("Digite o turno que você estuda (M, V, N): ");
        String turno = new java.util.Scanner(System.in).nextLine();
        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}
