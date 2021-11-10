package com.algaworks.fjoo.exemplostream.teste;

import com.algaworks.fjoo.exemplostream.faturaDAO.FaturaDAO;
import com.algaworks.fjoo.exemplostream.modelo.Fatura;

import java.util.List;
import java.util.stream.Stream;

public class Teste {
    public static void main(String[] args) {
        List<Fatura> faturas = new FaturaDAO().buscarTodasFaturas();

        Stream<Fatura> st = faturas.stream()
                                .filter(f -> f.getValor() > 250);
                                //também posso:
                                //.forEach(f -> sysout(f)

        st.forEach(f -> System.out.println(f));
    }
}
