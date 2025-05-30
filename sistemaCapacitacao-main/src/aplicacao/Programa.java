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
        isabela.setNome("jão");

        ServidorPublico jao = new ServidorPublico();
        ServidorPublico maria = new ServidorPublico(123,"Maria");
        System.out.println(maria.getNome());
        ServidorPublico jose = new ServidorPublico(134,"José", "Auditor" );
        System.out.println(jose.getNome());
        System.out.println(jose.getCargo());
        isabela.salarioHoraExtras (10, 5.60);

        System.out.println("Servidor: "+ isabela.getNome());
        System.out.printf("Horas extras R$ %.2f: ", isabela.getHorasExtras());
        System.out.println("Salário total: "+isabela.caucularSalarioTotal(1500));
        isabela.calcularNumeros(4,6,20,56);

    }
}
