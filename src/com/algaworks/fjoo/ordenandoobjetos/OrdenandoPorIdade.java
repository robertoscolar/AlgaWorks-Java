package com.algaworks.fjoo.ordenandoobjetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPorIdade {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(new Pessoa("Giovana",30), new Pessoa("Rebeca", 21),
                new Pessoa("Ana",40));
        IdadeComparator idadeComparator = new IdadeComparator();

        //deprecated
        //Collections.sort(pessoas, idadeComparator);
        pessoas.sort(idadeComparator);

        pessoas.forEach(System.out::println);

//        for (Pessoa a : pessoas) {
//            System.out.println(a);
//        }
    }
}
