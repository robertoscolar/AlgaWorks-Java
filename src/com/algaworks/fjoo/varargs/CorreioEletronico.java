package com.algaworks.fjoo.varargs;

public class CorreioEletronico {

    public void enviarEmail (String... emails) {

        //Varargs = ...
        //As vari�veis passadas ao m�todo n�o precisam ser mais passadas em forma de array
        //Posso usar quantas strings eu quiser e o varargs j� faz essa convers�o pra mim

        //percorrer todos os emails recebidos
        for (String email : emails) {
            //envia email
            System.out.println("E-mail enviado com sucesso para " + email);
        }
    }
}
