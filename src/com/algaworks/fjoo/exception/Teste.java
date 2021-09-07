package com.algaworks.fjoo.exception;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);
        try {
            cc.depositar(-10);
            //várias linhas de códigos se necessários
        }catch(IllegalArgumentException e) {
            System.out.println("Você executou uma operação ilegal! " + e.getMessage());

        }
    }
}
