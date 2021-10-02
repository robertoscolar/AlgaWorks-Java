package com.algaworks.fjoo.serializandoobjetos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializacaoObjeto {

    public static void main(String[] args) {

        try (ObjectInput input = new ObjectInputStream(new FileInputStream("joao.obj"))) {
            Pessoa p = (Pessoa) input.readObject();
            System.out.println(p.getNome());
            System.out.println(p.getIdade());
            System.out.println(p.getProfissao());
        }catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            System.err.println("Erro convertendo para a classe Pessoa");
            e.printStackTrace();
        }
    }
}
