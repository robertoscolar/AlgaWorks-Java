package com.algaworks.fjoo.interfacefuncional;

public class Teste {

    public static void main(String[] args) {
        //Impressora i = new ImpressoraHP();

        Impressora i = () -> {
            System.out.println("Testando impressora.");
        };

        i.imprimir();
    }
}
