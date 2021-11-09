package com.algaworks.fjoo.exemplolambda.exemplo;

import com.algaworks.fjoo.exemplolambda.dao.FaturaDAO;
import com.algaworks.fjoo.exemplolambda.modelo.Fatura;
import com.algaworks.fjoo.exemplolambda.util.EnviadorEmail;

import java.util.List;

public class ExemploLambda {
    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        EnviadorEmail enviarEmail = new EnviadorEmail();

        /*for (Fatura f : faturasVencidas) {
            enviarEmail.enviar(f.getEmailDevedor(), f.resumo());
        }*/

        //lambda
        faturasVencidas.forEach(f -> enviarEmail.enviar(f.getEmailDevedor(),f.resumo()));

        //referência de método
        faturasVencidas.forEach(Fatura::atualizarStatus);
    }
}
