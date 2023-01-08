package com.aula16.labs;

public class Ex02 {
    
    public static void main(String[] args) {
        
        // Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
        System.out.println("Digite um nome de usuário: ");
        String usuario = new java.util.Scanner(System.in).nextLine();
        System.out.println("Digite uma senha: ");
        String senha = new java.util.Scanner(System.in).nextLine();
        while (usuario.equals(senha)) {
            System.out.println("Senha igual ao nome de usuário!");
            System.out.println("Digite uma senha: ");
            senha = new java.util.Scanner(System.in).nextLine();
        }
        System.out.println("Usuário e senha válidos!");
    }
}
