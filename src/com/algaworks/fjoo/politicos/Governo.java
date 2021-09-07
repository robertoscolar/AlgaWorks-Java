package com.algaworks.fjoo.politicos;

import java.util.*;
import java.math.BigDecimal;

public class Governo {

    // armazena uma lista de pol�ticos por estado da federa��o
    private Map<String, List<Politico>> partidosPoliticos;

    public Governo() {
       this.partidosPoliticos = new HashMap<String, List<Politico>>();
    }

    public void adicionarPolitico(String partidoPolitico, Politico politico) {
        // recupera a lista de pol�ticos para um partido
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

        // se n�o existir uma lista de pol�ticos para o partido informado,
        // devemos instanciar uma nova lista (pois � a primeira inclus�o neste partido)
        if (politicos == null) {
            politicos = new ArrayList<Politico>();
        }

        // adiciona o pol�tico recebido como par�metro � lista de pol�ticos
        politicos.add(politico);

        // adiciona a lista de pol�ticos ao mapa de partidos usando
        // como chave o nome do partido
        this.partidosPoliticos.put(partidoPolitico, politicos);
    }

    public BigDecimal calcularGastosComSalario(String partido) {
        BigDecimal salarioTotal = new BigDecimal(0);
        for(String nomePartido : partidosPoliticos.keySet()) {
            for(Politico politico : partidosPoliticos.get(nomePartido)) {
                if(partido.equals(nomePartido)) {
                    salarioTotal = salarioTotal.add(new BigDecimal(politico.getCargo().getSalario().doubleValue()));
                }
            }
        }
        return salarioTotal;
    }


    public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
        // implementar busca dos pol�ticos para o partido e cargo informados
        // e c�lculo dos sal�rios
        BigDecimal salarioTotal = new BigDecimal(0);
        for (String nomePartido : partidosPoliticos.keySet()) {
            for (Politico politico : partidosPoliticos.get(nomePartido)) {
                if (partidoPolitico.equals(nomePartido) && politico.getCargo().equals(cargo)) {
                    salarioTotal = salarioTotal.add(new BigDecimal(politico.getCargo().getSalario().doubleValue()));
                }
            }
        }

        return salarioTotal;
    }


}