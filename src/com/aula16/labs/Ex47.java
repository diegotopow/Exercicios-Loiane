package com.aula16.labs;

public class Ex47{

    public static void main(String[] args) {
        
        // Em  uma  competição  de  ginástica,  cada  atleta  recebe  votos  de  sete jurados.  A  melhor
        // e  a  pior  nota  são  eliminadas.  A  sua  nota  fica  sendo  a  média  dos  votos  restantes.
        // Você  deve  fazer  um  programa  que  receba  o  nome  do  ginasta  e  as  notas  dos  sete  jurados
        // alcançadas  pelo  atleta  em  sua  apresentação  e  depois  informe  a  sua  média,  conforme  a
        // descrição  acima  informada  (retirar  o  melhor  e  o  pior  salto  e  depois  calcular  a  média
        // com  as  notas  restantes).  As  notas  não  são  informados  ordenadas.  Um  exemplo  de  saída
        // do  programa  deve  ser  conforme  o  exemplo  abaixo:
        // Atleta: Aparecido Parente
        // Nota: 9.9
        // Nota: 7.5
        // Nota: 9.5
        // Nota: 8.5
        // Nota: 9.0
        // Nota: 8.5
        // Nota: 9.7
        // Resultado final:
        // Atleta: Aparecido Parente
        // Melhor nota: 9.9
        // Pior nota: 7.5
        // Média: 9,04
        String nomeAtleta = "";
        double[] notas = new double[7];
        double melhorNota = 0;
        double piorNota = 0;
        double mediaNotas = 0;
        int continuar = 0;
        do {
            System.out.println("Digite o nome do atleta: ");
            nomeAtleta = new java.util.Scanner(System.in).next();
            if (nomeAtleta.equalsIgnoreCase("sair")) {
                break;
            }
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a " + (i + 1) + "ª nota: ");
                notas[i] = new java.util.Scanner(System.in).nextDouble();
            }
            melhorNota = notas[0];
            piorNota = notas[0];
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] > melhorNota) {
                    melhorNota = notas[i];
                }
                if (notas[i] < piorNota) {
                    piorNota = notas[i];
                }
            }
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] != melhorNota && notas[i] != piorNota) {
                    mediaNotas += notas[i];
                }
            }
            mediaNotas = mediaNotas / 5;
            System.out.println("Resultado final:");
            System.out.println("Atleta: " + nomeAtleta);
            System.out.println("Melhor nota: " + melhorNota);
            System.out.println("Pior nota: " + piorNota);
            System.out.println("Média: " + mediaNotas);
            System.out.println("Deseja continuar? 1 - Sim / 0 - Não");
            continuar = new java.util.Scanner(System.in).nextInt();
        } while (continuar == 1);
    }
}