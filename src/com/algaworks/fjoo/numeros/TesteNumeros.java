package com.algaworks.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

    public static void main(String[] args){
        DecimalFormat formatador = new DecimalFormat("R$#,##0.00");

        double valorProduto = 1330.59;
        System.out.println(formatador.format(valorProduto));

        String entrada = "R$ 50,50";
        try {
            double numero = formatador.parse(entrada).doubleValue();
            System.out.println("Número: " + numero);
        } catch (ParseException e) {
            System.out.println("Valor inválido.");
        }

        BigDecimal bg = new BigDecimal(5151515151551000d);
        bg = bg.divide(BigDecimal.TEN);
        System.out.println(bg);

    }
}