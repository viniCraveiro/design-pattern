package org.example.adapter;

public class Aluno {
    private String nome;
    private String RA;

    public Aluno(String nome, String RA) {
        this.nome = nome;
        this.RA = RA;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", RA=" + RA +
                '}';
    }

}
