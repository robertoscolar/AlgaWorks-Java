package com.algaworks.fjoo.interfaces.teste;

import com.algaworks.fjoo.interfaces.impressao.Impressora;
import com.algaworks.fjoo.interfaces.impressao.Imprimivel;

public class HP implements Impressora {

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println(imprimivel.getCabecalho());
        System.out.println("---------------------------------------");
        System.out.println(imprimivel.getCorpo());
    }
}
