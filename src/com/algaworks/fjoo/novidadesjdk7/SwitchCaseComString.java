package com.algaworks.fjoo.novidadesjdk7;

public class SwitchCaseComString {

    public static void main(String[] args) {
        String carro = "Audi";

        //antes do java 7 não era possível fazer switch case com string
        switch (carro) {
            case "Audi":
                System.out.println("Alemão");
                break;
            case "Ferrari":
                System.out.println("Italiano");
                break;
            case "Honda":
                System.out.println("Japonês");
                break;
        }
    }
}
