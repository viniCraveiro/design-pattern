package org.example.adapter;


public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter("Vinicius Craveiro", "22092167-2", "Laboratorio 22", 33);

        Aluno aluno = adapter.getAluno();
        Laboratorio laboratorio = adapter.getLaboratorio();

        System.out.println("ALUNO: "+aluno);
        System.out.println("LABORATORIO: "+laboratorio);
    }
}