package com.algaworks.fjoo.ordenandoobjetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPorNome {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(new Pessoa("João",22), new Pessoa("Mariana", 21),
                new Pessoa("Adalberto",19));

        Collections.sort(pessoas);

        for (Pessoa a : pessoas) {
            System.out.println(a);
        }

    }
}
