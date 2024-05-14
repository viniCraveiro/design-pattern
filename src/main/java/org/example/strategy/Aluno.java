package org.example.strategy;

class Aluno {
    private String nome;
    private double[] notas;
    private CalculoMedia calculoMedia;

    public Aluno(String nome, double[] notas, CalculoMedia calculoMedia) {
        this.nome = nome;
        this.notas = notas;
        this.calculoMedia = calculoMedia;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public double calcularMedia() {
        return calculoMedia.calcularMedia(this);
    }

    public void setCalculoMedia(CalculoMedia calculoMedia) {
        this.calculoMedia = calculoMedia;
    }
}