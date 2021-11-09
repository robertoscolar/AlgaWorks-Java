package com.algaworks.fjoo.exemplolambda.dao;

import com.algaworks.fjoo.exemplolambda.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarFaturasVencidas() {
        //buscaria isso no banco de dados
        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("joao@biscotao.com", 350.0));
        faturas.add(new Fatura("reitao@rabicabi.com", 250.0));
        faturas.add(new Fatura("roland@roland.com", 150.0));
        return faturas;
    }
}
