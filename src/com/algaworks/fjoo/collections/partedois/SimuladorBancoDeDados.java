package com.algaworks.fjoo.collections.partedois;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {

    public static Set<Aluno> buscarAlunos() {

        Set<Aluno> alunos = new HashSet<Aluno>();
        alunos.add(new Aluno("Gustavo"));
        alunos.add(new Aluno("Harry"));
        alunos.add(new Aluno("Joao"));
        alunos.add(new Aluno("Ronaldo"));

        return alunos;
        }
}
