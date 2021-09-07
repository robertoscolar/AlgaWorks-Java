package com.algaworks.fjoo.exception;

public class ContaCorrente {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        if (deposito <= 0) {
            throw new IllegalArgumentException("O valor n�o pode ser menor que 0!");
        }
        this.saldo -= deposito;
    }

    public void sacar(double quantidade) throws SaldoInsuficienteException{
        double saldoTemp = saldo - quantidade;
        if (saldoTemp < 0) {
            throw new SaldoInsuficienteException("Voc� n�o possui saldo suficiente" +
                    " para a opera�ao");
        }
        this.saldo -= quantidade;
    }
}
