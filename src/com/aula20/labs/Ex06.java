package com.aula20.labs;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        
        // Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam
        // uma partida do jogo da velha, usando o computador para ver o tabuleiro. Cada jogador vai
        // alternadamente informando a posição onde deseja colocar a sua peça (‘O’ ou ‘X’). O programa deve
        // impedir jogadas inválidas e determinar automaticamente quando o jogo terminou e quem foi o
        // vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situa&ccedil;&atilde;o do
        // tabuleiro na tela.

        Scanner scan = new Scanner(System.in);
        char[][] jogoDaVelha = new char[3][3];
        boolean ganhou = false;
        String vencedor = "";
        int jogada = 1;
        int linha = 0, coluna = 0;
        
    }
}