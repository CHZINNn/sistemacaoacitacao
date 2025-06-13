package aplicacao;

import entidades.ServidorPublico;
import entidades.Produto;
import entidades.Ex2;
import java.util.Scanner;

public class Programa {
    public Programa() {
    }

    public static void main(String[] args) {
////        ServidorPublico isabela = new ServidorPublico();
////        isabela.setNome("Isabela");
////        isabela.setCargo("Auditor");
////        isabela.setOrgao("ANVISA");
////        isabela.setLotacao("Brasilia");
////        isabela.setEmail("isabela@gmail.");
////
////        ServidorPublico João = new ServidorPublico();
////        ServidorPublico maria = new ServidorPublico(123, "Maria");
////            System.out.println(maria.getNome());
////
////        ServidorPublico jose= new ServidorPublico(134, "José,", "Auditor");
////            System.out.println(jose.getNome());
////            System.out.println(jose.getCargo());
////
////        System.out.println("Servidor: "+ isabela.getNome());
////
////        isabela.calcularSalarioHorasExtras(10, 5);
////        System.out.println("Servidor "+ isabela.getNome());
////        System.out.printf("Horas extras R$ %.2f: ",isabela.getHorasExtras());
////        System.out.println("Salário total : " +isabela.calcularSalarioTotal(1512));
//        String nome;
//        int qntd;
//        double preco;
//        Scanner leia = new Scanner(System.in);
//        System.out.println("Nome do produto: ");
//        nome = leia.nextLine();
//        System.out.println("Quantidade: ");
//        qntd = leia.nextInt();
//        System.out.println("O preço é: ");
//        preco = leia.nextDouble();
//        Produto produto = new Produto(nome, preco, qntd);
//
        String nome;
        double salarioB;
        double tax;
        Scanner leia = new Scanner(System.in);
        System.out.println("Nome do funcionário: ");
        nome = leia.nextLine();
        System.out.println("Seu salário bruto é: ");
        salarioB = leia.nextDouble();
        System.out.println("Seus impostos são de: ");
        tax = leia.nextDouble();
        Ex2 funcionario = new Ex2();
        funcionario.setName(nome);
        funcionario.setGrossSalary(salarioB);
        funcionario.setTax(tax);
        System.out.println("Funcionário: "+funcionario.getName()+", "+funcionario.netSalary());

        System.out.println();
        System.out.println("Quantos porcentos adicionados ao salário: ");
        funcionario.increaseSalary(leia.nextDouble());
    }
}