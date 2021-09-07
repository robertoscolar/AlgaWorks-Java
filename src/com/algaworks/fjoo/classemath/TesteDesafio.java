package com.algaworks.fjoo.classemath;

import java.util.Scanner;

public class TesteDesafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de jogos que serão feitos:");
        int quantidadeJogos = entrada.nextInt();

        GeradorDeJogos jogos = new GeradorDeJogos();
        jogos.gerarJogo(quantidadeJogos);
        entrada.close();
    }

}
