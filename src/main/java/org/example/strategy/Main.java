package org.example.strategy;


public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Henrique", new double[]{7.5, 8.0, 9.0}, new MediaPonderada(new double[]{1, 2, 3}));
        Aluno aluno2 = new Aluno("Vinicius", new double[]{8.5, 9.0, 10.0}, new MediaSimples());

        System.out.println("Média de Henrique: " + aluno1.calcularMedia());
        System.out.println("Média de Vinicius: " + aluno2.calcularMedia());
    }
}