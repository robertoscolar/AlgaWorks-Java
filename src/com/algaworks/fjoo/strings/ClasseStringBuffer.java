package com.algaworks.fjoo.strings;

public class ClasseStringBuffer {
    public static void main(String[] args) {
        StringBuffer bf = new StringBuffer(); //thread-safe  - use no contexto de concorr�ncia
        //StringBuilder sb = new StringBuilder(); // no-thread-safe  - mais r�pido

        bf.append("Bem vindo ao curso de Java. ");
        bf.append("Fique � vontade para tirar suas d�vidas. ");
        bf.append("Estamos aqui para te ajudar.");

        System.out.println(bf.toString());

        bf.insert(26, " da Algaworks");

        System.out.println(bf);
    }

}
