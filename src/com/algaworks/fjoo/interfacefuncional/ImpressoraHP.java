package com.algaworks.fjoo.interfacefuncional;

public class ImpressoraHP implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("Enviando comando para a impressora HP.");
    }
}
