package com.algaworks.fjoo.desafionumeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor aleatório amego:");
        try {
            double valorAleatorio = entrada.nextDouble();

            BigDecimal bd = new BigDecimal(valorAleatorio);
            BigDecimal porcentagem = new BigDecimal("0.1");
            bd = bd.multiply(porcentagem);

            DecimalFormat df = new DecimalFormat("R$#,##0.00");
            System.out.println(df.format(bd));

        }catch (InputMismatchException e) {
            System.out.println("O valor informado não é válido!");
        }

    }
}
