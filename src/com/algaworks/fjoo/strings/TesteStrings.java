package com.algaworks.fjoo.strings;

public class TesteStrings {
    public static void main(String[] args) {
        //String, StringBuffer, StringBuilder

        StringBuilder sb = new StringBuilder("Ol�"); //Existe a StringBuilder
        sb.append(" Pessoal"); //Reaproveitando a StringBuilder

        String resultado = sb.toString();
        System.out.println("Com StringBuilder: " + resultado);

        //com multithread � recomend�vel usar o StringBuffer para isso
        //StringBuilder � mais r�pido que StringBuffer
    }

}
