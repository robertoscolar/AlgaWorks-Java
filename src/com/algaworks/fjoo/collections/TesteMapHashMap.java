package com.algaworks.fjoo.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Gustavo");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Pedro");
        Aluno a4 = new Aluno("João");

        Map<String,Aluno> alunos = new HashMap<String, Aluno>();

        alunos.put("1", a1);
        alunos.put("2", a2);
        alunos.put("3", a3);
        alunos.put("4", a4);

        imprimirAlunos(alunos);
    }

    private static void imprimirAlunos(Map<String, Aluno> alunos) {
        for (Aluno a : alunos.values()) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
