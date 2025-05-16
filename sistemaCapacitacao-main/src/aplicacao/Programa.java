package aplicacao;

import entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.");

        System.out.println("Servidor: "+ isabela.getNome());

    }
}
