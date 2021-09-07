package com.algaworks.fjoo.desafionumeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor aleatório amego:");
        String valorAleatorio = entrada.nextLine();

        DecimalFormat decimal = new DecimalFormat();
        try {
            double novoValorAleatorio = decimal.parse(valorAleatorio).doubleValue();
            System.out.println(novoValorAleatorio);
        } catch (ParseException e) {
            System.out.println("Valor inválido");;
        }

    }
}
