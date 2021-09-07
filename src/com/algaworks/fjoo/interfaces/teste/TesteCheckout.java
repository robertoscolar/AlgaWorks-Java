package com.algaworks.fjoo.interfaces.teste;

import com.algaworks.fjoo.interfaces.caixa.Checkout;
import com.algaworks.fjoo.interfaces.caixa.Compra;
import com.algaworks.fjoo.interfaces.impressao.Impressora;
import com.algaworks.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.fjoo.interfaces.pagamento.Operadora;

public class TesteCheckout {
    public static void main(String[] args) {
        Operadora operadora = new Cielo();
        Impressora impressora = new HP();

        Cartao cartao = new Cartao();
        cartao.setNumeroCartao("12321212");
        cartao.setNomeTitular("Joao Couves");

        Compra compra = new Compra();
        compra.setNomeCliente("Joao Couves");
        compra.setProduto("Caixa de Leite");
        compra.setValorTotal(10);

        Checkout checkout = new Checkout(impressora,operadora);
        checkout.fecharCompra(compra,cartao);

    }
}
