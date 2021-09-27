package com.algaworks.fjoo.exemplosregex;

public class SplitString {

    public static void main(String[] args) {
        String texto = "04O5Java9�16uma18linguagem4orientada1a7objetos.";

        String[] palavras = texto.split("\\d+");
        for (String palavra :  palavras) {
            System.out.println(palavra);
        }
    }

}
