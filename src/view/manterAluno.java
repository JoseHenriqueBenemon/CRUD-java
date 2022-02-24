package view;

import javax.swing.JOptionPane;
import controller.bdBean.Aluno;

public class manterAluno {
    public static void inserirAluno(){
        String ra = JOptionPane.showInputDialog("Entre com o Ra:");
        String nome = JOptionPane.showInputDialog("Entre com o nome:");
        String genero = JOptionPane.showInputDialog("Entre com o genero:");

        Aluno al = new Aluno(nome, ra, genero);
        JOptionPane.showMessageDialog(null, al.toString());
    }
}
