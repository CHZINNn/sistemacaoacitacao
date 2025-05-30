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

        isabela.salarioHoraExtras (10, 5.60);

        System.out.println("Servidor: "+ isabela.getNome());
        System.out.printf("Horas extras R$ %.2f: ", isabela.getHorasExtras());
        System.out.println("Salário total: "+isabela.caucularSalarioTotal());

    }
}
