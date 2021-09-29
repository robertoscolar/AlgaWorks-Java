package com.algaworks.fjoo.debug;

public class Teste {
    public static void main(String[] args) {

        long posicao = 3;
        long valor = Fibonacci.calcula(posicao);

        System.out.println("F(" + posicao + ") = " + valor);
    }
}
