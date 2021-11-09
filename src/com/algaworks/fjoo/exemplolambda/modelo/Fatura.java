package com.algaworks.fjoo.exemplolambda.modelo;


public class Fatura {

    private String emailDevedor;
    private double valor;

    public Fatura(String emailDevedor, double valor) {
        this.emailDevedor = emailDevedor;
        this.valor = valor;
    }

    public String getEmailDevedor() {
        return emailDevedor;
    }

    public void setEmailDevedor(String emailDevedor) {
        this.emailDevedor = emailDevedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String resumo() {
        return "Valor devido: " + this.getValor();
    }

    public void atualizarStatus() {
        System.out.println("Novo Valor: R$ " + this.getValor());
    }
}
