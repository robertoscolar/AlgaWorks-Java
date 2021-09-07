package com.algaworks.fjoo.collections.partedois;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        return nome != null ? nome.equals(aluno.nome) : aluno.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}



