package org.example.builder;

public class Main {
    public static void main(String[] args) {
        FaculdadeBuilder builder = new FaculdadeBuilder();
        builder.setNome("Instituição de Ensino Unicesumar");
        builder.setEndereco("Av. Guedner, 1610");
        builder.setTipo(TipoFaculdade.PRIVADO);

        Faculdade minhaFaculdade = builder.build();

        System.out.println(minhaFaculdade);

    }
}
