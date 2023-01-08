package com.aula15.labs;

public class Ex18 {
    
    public static void main(String[] args) {
        
        // Faça um programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
        // Dicas:
        // Verifique se o dia, mês e ano são válidos.
        // Verifique se o mês tem 31 dias, 30 dias ou 28 dias.
        // Verifique se o ano é bissexto.
        System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        String data = new java.util.Scanner(System.in).nextLine();
        String[] dataSplit = data.split("/");
        int dia = Integer.parseInt(dataSplit[0]);
        int mes = Integer.parseInt(dataSplit[1]);
        int ano = Integer.parseInt(dataSplit[2]);
        if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0) {
            if (mes == 2) {
                if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                    if (dia <= 29) {
                        System.out.println("Data válida.");
                    } else {
                        System.out.println("Data inválida.");
                    }
                } else {
                    if (dia <= 28) {
                        System.out.println("Data válida.");
                    } else {
                        System.out.println("Data inválida.");
                    }
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia <= 30) {
                    System.out.println("Data válida.");
                } else {
                    System.out.println("Data inválida.");
                }
            } else {
                System.out.println("Data válida.");
            }
        } else {
            System.out.println("Data inválida.");
        }        
    }
}