package com.algaworks.fjoo.interfaces.teste;

import com.algaworks.fjoo.interfaces.pagamento.Autorizavel;
import com.algaworks.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.fjoo.interfaces.pagamento.Operadora;

public class Cielo implements Operadora {

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123") &&
                autorizavel.getValorTotal() < 100;
    }
}
