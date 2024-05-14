package org.example.adapter;

public class Adapter {
    private Aluno aluno;
    private Laboratorio laboratorio;

    public Adapter(String nomeAluno, String RA, String nomeLaboratorio, int capacidadeLaboratorio) {
        this.aluno = new Aluno(nomeAluno, RA);
        this.laboratorio = new Laboratorio(nomeLaboratorio, capacidadeLaboratorio);
    }

    // Métodos de acesso simplificado para Aluno e Laboratorio
    public Aluno getAluno() {
        return aluno;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
}
