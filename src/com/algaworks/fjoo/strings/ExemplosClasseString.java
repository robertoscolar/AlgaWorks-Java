package com.algaworks.fjoo.strings;

public class ExemplosClasseString {
    public static void main(String[] args) {
        String a = "SKROWAGLA";

        for (int i = a.length(); i !=0 ; i--) {
            System.out.println(a.charAt(i-1));
        }

        char[] array = {'o','l','a'};
        String s = new String(array);
        System.out.println(s);

        String java = "Desenvolvimento Java";
        //public String substring(int beginIndex);
        //public String substring (int beginIndex, int endIndex);
        System.out.println(java.substring(16));
        System.out.println(java.substring(0, 15));

        String metodoTrim = "      Algaworks       ";
        System.out.println(metodoTrim.trim());
        System.out.println(metodoTrim);

        String palavraGrande = "Curso_online_de_desenvolvimento_de_software";
        String[] array2 = palavraGrande.split("_");
        for (int i = 0; i < array2.length ; i++) {
            System.out.println("[" + i + "] " + array2[i]);
        }

        String string = "java";
        int indice = string.indexOf('a');
        System.out.println(indice);

        indice = string.lastIndexOf('a');
        System.out.println(indice);

        String bah = "Desenvolvimento Java";
        System.out.println(bah.replaceAll("Java", "de software"));
    }
}

