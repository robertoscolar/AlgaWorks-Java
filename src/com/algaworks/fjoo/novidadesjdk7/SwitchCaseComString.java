package com.algaworks.fjoo.novidadesjdk7;

public class SwitchCaseComString {

    public static void main(String[] args) {
        String carro = "Audi";

        //antes do java 7 n�o era poss�vel fazer switch case com string
        switch (carro) {
            case "Audi":
                System.out.println("Alem�o");
                break;
            case "Ferrari":
                System.out.println("Italiano");
                break;
            case "Honda":
                System.out.println("Japon�s");
                break;
        }
    }
}
