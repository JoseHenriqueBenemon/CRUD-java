//Pacote para organizar as classes
package view;

//Importando as classes
import javax.swing.JOptionPane;
import controller.ControllerFuncionario;
import model.bean.Funcionario;
import java.sql.SQLException;
import java.util.List;

public class ManterFuncionario {
    
    //Definindo uma variavel do tipo ControllerFuncionario
    static ControllerFuncionario contFunc;

    public static void excluir() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));

        //Instanciando a classe Funcionario usando um construtor
        Funcionario funcEntrada = new Funcionario(id);

        //Instanciando a classe ControllerFuncionario
        contFunc = new ControllerFuncionario();

        //Guardando o conteúdo que será retornado do ControllerFuncionario usando o método excluir()
        Funcionario funcSaida = contFunc.excluir(funcEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, funcSaida.toString());

        //Voltando para o menu
        menu();
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        //Criando e setando valores nas variaveis
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String nome = JOptionPane.showInputDialog("Nome");
        String carteira = JOptionPane.showInputDialog("Carteira de trabalho");
        String cargo = JOptionPane.showInputDialog("Cargo");
        String salario = JOptionPane.showInputDialog("Salário");

        //Instanciando a classe Funcionario usando um construtor
        Funcionario funcEntrada = new Funcionario(id,nome, carteira, cargo, salario);

        //Instanciando a classe ControllerFuncionario
        contFunc = new ControllerFuncionario();

        //Guardando o conteúdo que será retornado do ControllerFuncionario usando o método alterar()
        Funcionario funcSaida = contFunc.alterar(funcEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, funcSaida.toString());

        //Voltando para o menu
        menu();
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        String nome = JOptionPane.showInputDialog("Nome");

        //Instanciando a classe Funcionario usando um construtor
        Funcionario funcEntrada = new Funcionario(nome);

        //Instanciando a classe ControllerFuncionario
        contFunc = new ControllerFuncionario();

        //Guardando o conteúdo que será retornado do ControllerFuncionario usando o método listar()
        List<Funcionario> listaFuncSaida = contFunc.listar(funcEntrada);

        //Guardando os valores dentro da lista em variaveis separadas
        for(Funcionario func : listaFuncSaida) {
            //Mostrando para o usuário o resultado da pesquisa
            JOptionPane.showMessageDialog(null, func.toString());
        }

        //Voltando para o menu
        menu();
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));

        //Instanciando a classe Funcionario usando um construtor
        Funcionario funcEntrada = new Funcionario(id);

        //Instanciando a classe ControllerFuncionario
        contFunc = new ControllerFuncionario();

        //Guardando o conteúdo que será retornado do ControllerFuncionario usando o método buscar()
        Funcionario funcSaida = contFunc.buscar(funcEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, funcSaida.toString());

        //Voltando para o menu
        menu();
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        //Criando e setando valores nas variaveis
        String nome = JOptionPane.showInputDialog("Nome");
        String carteira = JOptionPane.showInputDialog("Carteira de trabalho");
        String cargo = JOptionPane.showInputDialog("Cargo");
        String salario = JOptionPane.showInputDialog("Salário");

        //Instanciando a classe Funcionario usando um construtor
        Funcionario funcEntrada = new Funcionario(nome, carteira, cargo, salario);

        //Instanciando a classe ControllerFuncionario
        contFunc = new ControllerFuncionario();

        //Guardando o conteúdo que será retornado do ControllerFuncionario usando o método inserir()
        Funcionario funcSaida = contFunc.inserir(funcEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, funcSaida.toString());

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

