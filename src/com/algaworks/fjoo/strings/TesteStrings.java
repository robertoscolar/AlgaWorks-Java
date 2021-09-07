package com.algaworks.fjoo.strings;

public class TesteStrings {
    public static void main(String[] args) {
        //String, StringBuffer, StringBuilder

        StringBuilder sb = new StringBuilder("Olá"); //Existe a StringBuilder
        sb.append(" Pessoal"); //Reaproveitando a StringBuilder

        String resultado = sb.toString();
        System.out.println("Com StringBuilder: " + resultado);

        //com multithread é recomendável usar o StringBuffer para isso
        //StringBuilder é mais rápido que StringBuffer
    }

}
