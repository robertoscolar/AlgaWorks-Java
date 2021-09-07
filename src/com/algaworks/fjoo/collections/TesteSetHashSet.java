package com.algaworks.fjoo.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gustavo");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Pedro");
        Aluno a4 = new Aluno("Jo�o");

        Set<Aluno> alunos = new HashSet<Aluno>();
        //HashSet n�o aceita repeti��es
        //A ordem � aleat�ria

        alunos.add(a1);
        alunos.add(a3);
        alunos.add(a2);
        alunos.add(a4);

        imprimirAlunos(alunos);

    }

    public static void imprimirAlunos(Set<Aluno> alunos) {
        for (Aluno a : alunos){
            System.out.println("Aluno: " + a.getNome());
        }
    }
}
