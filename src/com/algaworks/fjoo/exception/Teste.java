package com.algaworks.fjoo.exception;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);
        try {
            cc.depositar(-10);
            //v�rias linhas de c�digos se necess�rios
        }catch(IllegalArgumentException e) {
            System.out.println("Voc� executou uma opera��o ilegal! " + e.getMessage());

        }
    }
}
