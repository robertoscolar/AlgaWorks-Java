package com.algaworks.fjoo.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {


        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Jo�o"));
        funcionarios.add(new Funcionario("Maria"));

        //com generics s� � poss�vel adicionar objetos do tipo funcion�rio
        //isso diminui a quantidade erros e de casts
        //funcionarios.add("Ricardo");




    }



}
