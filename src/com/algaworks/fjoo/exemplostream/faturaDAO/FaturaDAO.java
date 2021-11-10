package com.algaworks.fjoo.exemplostream.faturaDAO;

import com.algaworks.fjoo.exemplostream.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarTodasFaturas() {

        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("joao@joao.com", 335.0));
        faturas.add(new Fatura("joaocapitao@joao.com",330.0));
        faturas.add(new Fatura("mariaboazinha@maria.com", 100.0));

        return faturas;
    }
}
