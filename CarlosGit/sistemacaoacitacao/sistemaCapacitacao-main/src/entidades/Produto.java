package entidades;

import java.util.Scanner;
public class Produto {
    private String name;
    private double price;
    private int quantity;

    public Produto() {
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public double getPreco() {
        return price;
    }

    public void setPreco(double preco) {
        this.price = preco;
    }

    public int getQuantidade() {
        return quantity;
    }

    public void setQuantidade(int quantidade) {
        this.quantity = quantidade;
    }

    public double calcularValorTotal() {
        return price * quantity;
    }

    public void entrada(int quantidade) {
        if (quantidade > 0) {
            this.quantity += quantidade;
        }
    }

    public void saida(int quantidade) {
        if (quantidade > 0) {
            if (quantidade <= this.quantity) {
                this.quantity -= quantidade;
            }
        }
    }

    public void mostrarDados() {
        System.out.println("\n=== Dados do Produto ===");
        System.out.println("Nome: " + name);
        System.out.printf("Preço: R$ %.2f%n", price);
        System.out.println("Quantidade no estoque: " + quantity);
        System.out.printf("Valor total no estoque: R$ %.2f%n", calcularValorTotal());
        System.out.println("========================\n");
    }

    public static void main(String[] args) {

    }
}
