//Pacote para organizar as classes
package view;

//Importando as classes
import javax.swing.JOptionPane;
import controller.ControllerFlor;
import model.bean.Flor;
import java.sql.SQLException;
import java.util.List;

public class ManterFlor {
    
    //Definindo uma variavel do tipo ControllerFlor
    static ControllerFlor contFlor;

    public static void excluir() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));

        //Instanciando a classe Flor usando um construtor
        Flor florEntrada = new Flor(id);

        //Instanciando a classe ControllerFlor
        contFlor = new ControllerFlor();

        //Guardando o conteúdo que será retornado do ControllerFlor usando o método excluir()
        Flor usuSaida = contFlor.excluir(florEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, usuSaida.toString());

        //Voltando para o menu
        menu();
    }
    
    public static void alterar() throws SQLException, ClassNotFoundException {
        //Criando e setando valores nas variaveis
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String nome = JOptionPane.showInputDialog("Nome");
        String genero = JOptionPane.showInputDialog("Genêro");
        String familia = JOptionPane.showInputDialog("familia");
        String ordem = JOptionPane.showInputDialog("ordem");
        String classe = JOptionPane.showInputDialog("classe");

        //Instanciando a classe Flor usando um construtor
        Flor florEntrada = new Flor(id, nome, genero, familia, ordem, classe);

        //Instanciando a classe ControllerFlor
        contFlor = new ControllerFlor();

        //Guardando o conteúdo que será retornado do ControllerFlor usando o método alterar()
        Flor florSaida = contFlor.alterar(florEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, florSaida.toString());

        //Voltando para o menu
        menu();
    }
    
    public static void listar() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        String nome = JOptionPane.showInputDialog("Nome");

        //Instanciando a classe Flor usando um construtor
        Flor florEntrada = new Flor(nome);

        //Instanciando a classe ControllerFlor
        contFlor = new ControllerFlor();

        //Guardando o conteúdo que será retornado do ControllerFlor usando o método listar()
        List<Flor> listaFlorSaida = contFlor.listar(florEntrada);

        //Guardando os valores dentro da lista em variaveis separadas
        for(Flor flor : listaFlorSaida) {
            //Mostrando para o usuário o resultado da pesquisa
            JOptionPane.showMessageDialog(null, flor.toString());
        }

        //Voltando para o menu
        menu();
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));

        //Instanciando a classe Flor usando um construtor
        Flor florEntrada = new Flor(id);

        //Instanciando a classe ControllerFlor
        contFlor = new ControllerFlor();

        //Guardando o conteúdo que será retornado do ControllerFlor usando o método buscar()
        Flor florSaida = contFlor.buscar(florEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, florSaida.toString());

        //Voltando para o menu
        menu();
    }
    
    public static void inserir() throws SQLException, ClassNotFoundException {
        //Criando e setando valores nas variaveis
        String nome = JOptionPane.showInputDialog("Nome");
        String genero = JOptionPane.showInputDialog("Genêro");
        String familia = JOptionPane.showInputDialog("Familia");
        String ordem = JOptionPane.showInputDialog("Ordem");
        String classe = JOptionPane.showInputDialog("Classe");

        //Instanciando a classe Flor usando um construtor pré-determinad
        Flor florEntrada = new Flor(nome, genero, familia, ordem, classe);

        //Instanciando a classe ControllerFlor
        contFlor = new ControllerFlor();

        //Guardando o conteúdo que será retornado do ControllerFlor usando o método inserir()
        Flor florSaida = contFlor.inserir(florEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, florSaida.toString());

        //Voltando para o menu
        menu();
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
