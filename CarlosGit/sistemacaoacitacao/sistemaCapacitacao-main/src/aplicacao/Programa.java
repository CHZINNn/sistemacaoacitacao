package aplicacao;

import entidades.Produto;
import entidades.ServidorPublico;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela");
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasilia");
//        isabela.setEmail("isabela@gmail.");
//        isabela.setNome("jão");
//
//        ServidorPublico jao = new ServidorPublico();
//        ServidorPublico maria = new ServidorPublico(123,"Maria");
//        System.out.println(maria.getNome());
//        ServidorPublico jose = new ServidorPublico(134,"José", "Auditor" );
//        System.out.println(jose.getNome());
//        System.out.println(jose.getCargo());
//        isabela.salarioHoraExtras (10, 5.60);
//
//        System.out.println("Servidor: "+ isabela.getNome());
//        System.out.printf("Horas extras R$ %.2f: ", isabela.getHorasExtras());
//        System.out.println("Salário total: "+isabela.calcularSalarioTotal(1500));
//        isabela.calcularNumeros(4,6,20,56);


        ///
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Informe os dados do produto:");

        System.out.print("Nome: ");
        produto.setNome(scanner.nextLine());

        while (true) {
            System.out.print("Preço: R$ ");
            String precoInput = scanner.nextLine();
            try {
                double preco = Double.parseDouble(precoInput);
                if (preco >= 0) {
                    produto.setPreco(preco);
                    break;
                }
            } catch (NumberFormatException e) {
            }
        }
        while (true) {
            System.out.print("Quantidade no estoque: ");
            String qtdInput = scanner.nextLine();
            try {
                int qtd = Integer.parseInt(qtdInput);
                if (qtd >= 0) {
                    produto.setQuantidade(qtd);
                    break;
                }
            } catch (NumberFormatException e) {
            }
        }
        System.out.print("Quantidade para entrada no estoque: ");
        while (true) {
            String entradaInput = scanner.nextLine();
            try {
                int entrada = Integer.parseInt(entradaInput);
                produto.entrada(entrada);
                break;
            } catch (NumberFormatException e) {
            }
        }
        System.out.println("Dados do produto após a entrada:");
        produto.mostrarDados();

        System.out.print("Quantidade para saída no estoque: ");
        while (true) {
            String saidaInput = scanner.nextLine();
            try {
                int saida = Integer.parseInt(saidaInput);
                produto.saida(saida);
                break;
            } catch (NumberFormatException e) {
            }
        }
        System.out.println("Dados do produto após a saída:");
        produto.mostrarDados();
    }
}



