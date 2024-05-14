package org.example.adapter;

public class Laboratorio {
    private String nome;
    private int capacidade;

    public Laboratorio(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "nome='" + nome + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}
