package com.algaworks.fjoo.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {


        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("João"));
        funcionarios.add(new Funcionario("Maria"));

        //com generics só é possível adicionar objetos do tipo funcionário
        //isso diminui a quantidade erros e de casts
        //funcionarios.add("Ricardo");




    }



}
