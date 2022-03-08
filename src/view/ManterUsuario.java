/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//import's
import javax.swing.JOptionPane;
import controller.ControllerUsuario;
import model.bean.Usuario;

/**
 *
 * @author ProfAlexandre
 */
public class ManterUsuario {
    
    //pegando a classe do arquivo ControllerUsuario
    static ControllerUsuario contUsu;

    //Criando a classe excluir
    public static void excluir() {
        
    }

    //Criando a classe alterar
    public static void alterar() {
        
    }

    ////Criando a classe listar
    public static void listar() {
        
    }

    //Criando a classe buscar
    public static void buscar() {
        
    }

    //Criando a classe inserir
    public static void inserir() {
        //pegando valores e inserindo em variaveis
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        String status = JOptionPane.showInputDialog("Status");
        String tipo = JOptionPane.showInputDialog("Tipo");

        //instanciando a classe Usuario
        Usuario usuEntrada = new Usuario(login, senha, status, tipo);
        
        //inicializnado a classe ControllerUsuario
        contUsu = new ControllerUsuario();

        //Inicialisnado a classe
        Usuario usuSaida = contUsu.inserir(usuEntrada);

        //Mostrando o resultado da inserção na tela por interface
        JOptionPane.showMessageDialog(null, usuSaida.toString());
        
    }
    
    public static boolean valida() {
        //variavel de validação
        boolean validado = false;

        //pegando valores e inserindo em variaveis
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");

        //instanciando a classe Usuario
        Usuario usuEntrada = new Usuario(login, senha);
        
        //inicializnado a classe ControllerUsuario
        contUsu = new ControllerUsuario();

        //Inicialisnado a classe
        Usuario usuSaida = contUsu.valida(usuEntrada);

        //Mostrando o resultado da inserção na tela por interface
        JOptionPane.showMessageDialog(null, usuSaida.toString());

        //verificando se o usuario é um ADM
        if(usuSaida.getTipo().equals("ADM")) { //caso sim ele retorna que o usuario é válido
            validado = true;
        }
        return validado;
    }
    
    
}
