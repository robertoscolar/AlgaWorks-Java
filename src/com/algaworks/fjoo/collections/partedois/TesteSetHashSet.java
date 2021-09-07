package com.algaworks.fjoo.collections.partedois;

import java.util.Set;

public class TesteSetHashSet {

    public static void main(String[] args) {
        Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();

        //De alguma forma, sorteia o nome do aluno e constrói o objeto Aluno
        Aluno alunoSorteado = new Aluno("Joao");

        if (alunos.contains(alunoSorteado)) {
            System.out.println("Parabéns " + alunoSorteado.getNome() + "! Você ganhou" +
                    " um brinde!");
        }else {
            System.out.println("Aluno não cadastrado em nosso sistema!");
        }

    }

}
