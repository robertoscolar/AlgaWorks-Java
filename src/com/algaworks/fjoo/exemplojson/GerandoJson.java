package com.algaworks.fjoo.exemplojson;

import com.algaworks.fjoo.exemplojson.modelo.Cliente;
import com.algaworks.fjoo.exemplojson.modelo.Endereco;
import com.algaworks.fjoo.exemplojson.modelo.Telefone;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class GerandoJson {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua das águas,10", "Ribeirão Preto", "SP");

        Telefone residencial = new Telefone("RESIDENCIAL", "11 3333-1111");
        Telefone comercial = new Telefone ("COMERCIAL", "11 4141-4141");
        List<Telefone> telefones = new ArrayList<>();
        telefones.add(residencial);
        telefones.add(comercial);

        Cliente cliente = new Cliente("João da Silva", 28, endereco, telefones);

        Gson gson = new Gson();

        String json = gson.toJson(cliente);

        System.out.println(json);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        Cliente c2 = gson.fromJson(json,Cliente.class);

        System.out.println(c2.getNome());
        System.out.println(c2.getTelefones().get(0).getNumero());
    }
}
