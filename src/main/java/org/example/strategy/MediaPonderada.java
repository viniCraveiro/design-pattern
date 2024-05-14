package org.example.strategy;


public class MediaPonderada implements CalculoMedia {
    private final double[] pesos;

    public MediaPonderada(double[] pesos) {
        this.pesos = pesos;
    }

    @Override
    public double calcularMedia(Aluno aluno) {
        double media = 0;
        double somaPesos = 0;

        for (int i = 0; i < aluno.getNotas().length; i++) {
            media += aluno.getNotas()[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return media / somaPesos;
    }
}
