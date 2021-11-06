package com.algaworks.fjoo.novidadesjdk7;

public class ExemploSeparadorDigitosLiterais {

    public static void main(String[] args) {
        long populacaoSaoPaulo = 11_000_000L;
        long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;

        double precoVeiculo = 200_000.99_1d;

        System.out.printf("População de São Paulo -> %d\n", populacaoSaoPaulo);
        System.out.printf("População da Grande São Paulo -> %d\n", populacaoGrandeSaoPaulo);
        System.out.printf("Preço veículo -> %.3f\n", precoVeiculo);
    }
}
