package aplicacao;

import entidades.ServidorPublico;
import entidades.Produto;
import entidades.Ex2;
import entidades.Cursos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    //        Lista de servidores
    List<ServidorPublico> servidores = new ArrayList<>();
    //        Lista de cursos
    List<Cursos> cursos = new ArrayList<>();

    public void adicionarServidorPublico() {
        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Matricula"));
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do Servidor");
        String orgao = JOptionPane.showInputDialog(null, "Informe o orgao");
        String cargo = JOptionPane.showInputDialog(null, "Informe o cargo do Servidor");
        String lotacao = JOptionPane.showInputDialog(null, "Informe lotacao do Servidor");
        String email = JOptionPane.showInputDialog(null, "Informe o email do Servidor");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salario do servidor"));

        ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, cargo, lotacao, email, salario);
        servidores.add(servidor);
    }
    public void listarServidores(){
        for (ServidorPublico servidor : servidores) {
            System.out.println(servidor);
        }
    }
    public void listarServidores(int matricula) {
        boolean encontrou = false;
        for(ServidorPublico servidor : servidores) {
            if(servidor.getMatricula() == matricula) {
                System.out.println(servidor);
                encontrou = true;
                break;
            }
        }
        if(!encontrou) {
            JOptionPane.showInputDialog(null, "Servidor não encontrado!!!");
        }
    }
    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.adicionarServidorPublico();
        programa.adicionarServidorPublico();
        programa.listarServidores();

        programa.listarServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar")));
    }
}