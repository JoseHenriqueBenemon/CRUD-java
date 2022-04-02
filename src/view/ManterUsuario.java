//Pacote para organizar as classes
package view;

//Importando as classes
import javax.swing.JOptionPane;
import controller.ControllerUsuario;
import model.bean.Usuario;
import java.sql.SQLException;
import java.util.List;

public class ManterUsuario {
    
    //Definindo uma variavel do tipo ControllerUsuario
    static ControllerUsuario contUsu;

    public static void excluir() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));

        //Instanciando a classe Usuario usando um construtor
        Usuario usuEntrada = new Usuario(id);

        //Instanciando a classe ControllerUsuario
        contUsu = new ControllerUsuario();

        //Guardando o conteúdo que será retornado do ControllerUsuario usando o método excluir()
        Usuario usuSaida = contUsu.excluir(usuEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, usuSaida.toString());

        //Voltando para o menu
        menu();
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        //Criando e setando valores nas variaveis
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        String status = JOptionPane.showInputDialog("Status");
        String tipo = JOptionPane.showInputDialog("Tipo");

        //Instanciando a classe Usuario usando um construtor
        Usuario usuEntrada = new Usuario(id,login, senha, status, tipo);

        //Instanciando a classe ControllerUsuario
        contUsu = new ControllerUsuario();

        //Guardando o conteúdo que será retornado do ControllerUsuario usando o método alterar()
        Usuario usuSaida = contUsu.alterar(usuEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, usuSaida.toString());

        //Voltando para o menu
        menu();
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        String login = JOptionPane.showInputDialog("Login");

        //Instanciando a classe Usuario usando um construtor
        Usuario usuEntrada = new Usuario(login);

        //Instanciando a classe ControllerUsuario
        contUsu = new ControllerUsuario();

        //Guardando o conteúdo que será retornado do ControllerUsuario usando o método listar()
        List<Usuario> listaUsuSaida = contUsu.listar(usuEntrada);

        //Guardando os valores dentro da lista em variaveis separadas
        for(Usuario usu : listaUsuSaida) {
            //Mostrando para o usuário o resultado da pesquisa
            JOptionPane.showMessageDialog(null, usu.toString());
        }

        //Voltando para o menu
        menu();
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));

        //Instanciando a classe Usuario usando um construtor
        Usuario usuEntrada = new Usuario(id);

        //Instanciando a classe ControllerUsuario
        contUsu = new ControllerUsuario();

        //Guardando o conteúdo que será retornado do ControllerUsuario usando o método buscar()
        Usuario usuSaida = contUsu.buscar(usuEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, usuSaida.toString());

        //Voltando para o menu
        menu();
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        //Criando e setando valores nas variaveis
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        String status = JOptionPane.showInputDialog("Status");
        String tipo = JOptionPane.showInputDialog("Tipo");

        //Instanciando a classe Usuario usando um construtor
        Usuario usuEntrada = new Usuario(login, senha, status, tipo);

        //Instanciando a classe ControllerUsuario
        contUsu = new ControllerUsuario();

        //Guardando o conteúdo que será retornado do ControllerUsuario usando o método inserir()
        Usuario usuSaida = contUsu.inserir(usuEntrada);
        
        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, usuSaida.toString());

        //Voltando para o menu
        menu();
    }
    
    public static boolean valida() throws SQLException, ClassNotFoundException {
        //Criando e setando valores nas variaveis
        boolean validado = false;
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");

        //Instanciando a classe Usuario usando um construtor
        Usuario usuEntrada = new Usuario(login, senha);

        //Instanciando a classe ControllerUsuario
        contUsu = new ControllerUsuario();

        //Guardando o conteúdo que será retornado do ControllerUsuario usando o método validar()
        validado = contUsu.validar(usuEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, "Usuario = " + validado);

        //retornando o resultado da validação do usuário
        return validado;
    }
    
    public static void menu() throws SQLException, ClassNotFoundException {
        //Criando e setando a variavel para ser usada no menu 
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("0 - Sair \n 1 - Inserir \n 2 - Alterar \n 3 - Excluir \n 4 - Buscar \n 5 - Listar"));
        switch (operacao) {
            case 0:
               int sair = JOptionPane.showConfirmDialog(null,"Deseja Sair");
               System.out.println("Valor de Sair = " + sair);
               if(sair > 0) menu();
               break;
            case 1:
               inserir();
               break;
           case 2:
               alterar();
               break;
           case 3:
               excluir();
               break;
           case 4:
               buscar();
               break;
           case 5:
               listar();
               break;
           default:
               JOptionPane.showMessageDialog(null,"Erro opcao invalida");
               menu();
               break;
        }
    }
   
}
