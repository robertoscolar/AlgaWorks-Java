package com.algaworks.fjoo.serializandoobjetos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializandoObjeto {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(19);
        pessoa.setProfissao("Motorista");

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("joao.obj"))) {
            out.writeObject(pessoa);
            System.out.println("Objeto salvo com sucesso.");
        } catch (IOException e ) {
            System.err.println("Erro salvando o objeto. "  + e.getMessage());
            e.printStackTrace();
        }
    }
}
