package com.algaworks.fjoo.interfaces.caixa;

import com.algaworks.fjoo.interfaces.impressao.Impressora;
import com.algaworks.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.fjoo.interfaces.pagamento.Operadora;

public class Checkout {

    private Impressora impressora;
    private Operadora operadora;

    public Checkout(Impressora impressora, Operadora operadora) {
        this.impressora = impressora;
        this.operadora = operadora;
    }

    public void fecharCompra(Compra compra, Cartao cartao) {
        boolean autorizado = this.operadora.autorizar(compra, cartao);

        if (autorizado) {
            this.impressora.imprimir(compra);
        }else {
            System.out.println("O pagamento foi negado");
        }

    }
}

