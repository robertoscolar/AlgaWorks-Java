package com.algaworks.fjoo.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gustavo");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Pedro");
        Aluno a4 = new Aluno("João");

        //List é a interface
        //ArrayList é a classe
        //<> --> Generics
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);

        imprimirAlunos(alunos);

        /* em array eu faria:
        Aluno[] array = new Aluno[4];
        array[0] = a1;
         */
    }
    public static void imprimirAlunos(List <Aluno> alunos) {
        //for avançado
        for (Aluno a : alunos) {
            System.out.println("Aluno: " + a.getNome());
        }
    }
}
