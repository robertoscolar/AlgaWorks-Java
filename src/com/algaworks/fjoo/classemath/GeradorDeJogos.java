package com.algaworks.fjoo.classemath;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeJogos {

    public void gerarJogo(int quantidadeJogos) {
        for (int i = 0; i < quantidadeJogos; i++) {
            List<Integer> jogo = new ArrayList<Integer>();

            for (int j = 0; j < 6; j++) {
                int novoNumero = (int) Math.round(Math.random() * 60);
                if (jogo.contains(novoNumero)) {
                    j--;
                }else {
                    jogo.add(novoNumero);
                }
            }imprimirJogo(i, jogo);
        }
    }

    private void imprimirJogo(int contador, List<Integer> jogo) {
        System.out.println("---------------------------------");
        System.out.println("Jogo número " + (contador+1));
        System.out.println("---------------------------------");
        for (Integer a : jogo) {
            System.out.println(a);
        }
    }
}