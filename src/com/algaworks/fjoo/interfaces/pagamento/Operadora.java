package com.algaworks.fjoo.interfaces.pagamento;

public interface Operadora {

    public boolean autorizar(Autorizavel autorizavel, Cartao cartao);

}
