package org.example.strategy;


public class MediaSimples implements CalculoMedia {

    @Override
    public double calcularMedia(Aluno aluno) {
        double media = 0;

        for (double nota : aluno.getNotas()) {
            media += nota;
        }

        return media / aluno.getNotas().length;
    }
}