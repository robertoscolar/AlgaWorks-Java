package com.algaworks.fjoo.politicos;

import java.util.*;
import java.math.BigDecimal;

public class Governo {

    // armazena uma lista de políticos por estado da federação
    private Map<String, List<Politico>> partidosPoliticos;

    public Governo() {
       this.partidosPoliticos = new HashMap<String, List<Politico>>();
    }

    public void adicionarPolitico(String partidoPolitico, Politico politico) {
        // recupera a lista de políticos para um partido
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

        // se não existir uma lista de políticos para o partido informado,
        // devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
        if (politicos == null) {
            politicos = new ArrayList<Politico>();
        }

        // adiciona o político recebido como parâmetro à lista de políticos
        politicos.add(politico);

        // adiciona a lista de políticos ao mapa de partidos usando
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
        // implementar busca dos políticos para o partido e cargo informados
        // e cálculo dos salários
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