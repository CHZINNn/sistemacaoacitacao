package aplicacao;

import entidades.Cursos;
import entidades.Produto;
import entidades.ServidorPublico;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {





    //        excluirServidorPublico( int matricula);
//        calcularFolhaServidoresPublicos();
//
    public static void main(String[] args) {
        ServidorPublico servidorPublico  = new ServidorPublico();

        servidorPublico.adicionarServidorPublico();
        servidorPublico.adicionarServidorPublico();
        servidorPublico.listarServidores();

        servidorPublico.listarServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar")));servidorPublico.listarServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar")));
        servidorPublico.excluirServidores(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula a ser excluída")));
        servidorPublico.listarServidores();
    }


}