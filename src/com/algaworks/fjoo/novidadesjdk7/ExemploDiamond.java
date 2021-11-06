package com.algaworks.fjoo.novidadesjdk7;

import java.util.*;

public class ExemploDiamond {
    public static void main(String[] args) {

        //com o diamond do java 7 só é preciso informar o tipo na declaração da variável
        List<String> nomesClientes = new ArrayList<>();
        nomesClientes.add("Roberto");
        nomesClientes.add("Maria");

        for (String cliente: nomesClientes) {
            System.out.println(cliente);
        }

        Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
        carrosPorMontadora.put("Chevrolet",new HashSet<String>());
        carrosPorMontadora.get("Chevrolet").add("Cruze");

        Set<String> carrosDaVolks;
        carrosPorMontadora.put("Volks", carrosDaVolks = new HashSet<>());
        carrosPorMontadora.get("Volks").add("Gol");
    }
}
