package com.algaworks.fjoo.exception;

public class TesteExcessõesChecadas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);

        try {
            cc.sacar(60);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo " + cc.getSaldo());
        System.out.println("-------------------------------");

        try {
            cc.sacar(60);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {

        }
        System.out.println("Saldo " + cc.getSaldo());
        System.out.println("-------------------------------");
    }
}
