package org.example.builder;


public class Faculdade {
    private String nome;
    private String endereco;
    private TipoFaculdade tipo;

    public Faculdade(String nome, String endereco, TipoFaculdade tipo) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Faculdade{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
