package org.example.builder;

public class FaculdadeBuilder implements Builder {
    private String nome;
    private String endereco;
    private TipoFaculdade tipo;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void setTipo(TipoFaculdade tipo) {
        this.tipo = tipo;
    }

    public Faculdade build() {
        return new Faculdade(nome, endereco, tipo);
    }
}

