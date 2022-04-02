//Pacote para organizar as classes
package view;

//Importando as classes
import controller.ControllerFuncFlor;
import model.bean.FuncFlor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ManterFuncFlor {
    
    //Definindo uma variavel do tipo ControllerFuncFlor
    static ControllerFuncFlor contFuFl;
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));

        //Instanciando a classe FuncFlor usando um construtor
        FuncFlor ffEntrada = new FuncFlor(id);

        //Instanciando a classe ControllerFuncFlor
        contFuFl = new ControllerFuncFlor();

        //Guardando o conteúdo que será retornado do ControllerFuncFlor usando o método excluir()
        FuncFlor ffSaida = contFuFl.excluir(ffEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, ffSaida.toString());

        //Voltando para o menu
        menu();
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        //Criando e setando valores nas variaveis
        int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
        int idFunc = Integer.parseInt(JOptionPane.showInputDialog("id do Funcionário"));
        int idFlor = Integer.parseInt(JOptionPane.showInputDialog("id da Flor"));
        String dt_compra = JOptionPane.showInputDialog("Data da compra");
        String valor = JOptionPane.showInputDialog("Valor");
        String obs = JOptionPane.showInputDialog("Observação");

        //Instanciando a classe FuncFlor usando um construtor
        FuncFlor ffEntrada = new FuncFlor(id, idFunc, idFlor, dt_compra, valor, obs);

        //Instanciando a classe ControllerFuncFlor
        contFuFl = new ControllerFuncFlor();

        //Guardando o conteúdo que será retornado do ControllerFuncFlor usando o método alterar()
        FuncFlor ffSaida = contFuFl.alterar(ffEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, ffSaida.toString());

        //Voltando para o menu
        menu();
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        String dt_compra = JOptionPane.showInputDialog("Data da compra");

        //Instanciando a classe FuncFlor usando um construtor
        FuncFlor ffEntrada = new FuncFlor(dt_compra);
        
        //Instanciando a classe ControllerFuncFlor
        contFuFl = new ControllerFuncFlor();

        //Guardando o conteúdo que será retornado do ControllerFuncFlor usando o método listar()
        List<FuncFlor> listaFfSaida = contFuFl.listar(ffEntrada);

        //Guardando os valores dentro da lista em variaveis separadas
        for(FuncFlor fufl : listaFfSaida) {
            //Mostrando para o usuário o resultado da pesquisa
            JOptionPane.showMessageDialog(null, fufl.toString());
        }

        //Voltando para o menu
        menu();
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        //Criando e setando valor na variavel
        int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));

        //Instanciando a classe FuncFlor usando um construtor
        FuncFlor ffEntrada = new FuncFlor(id);

        //Instanciando a classe ControllerFuncFlor
        contFuFl = new ControllerFuncFlor();

        //Guardando o conteúdo que será retornado do ControllerFuncFlor usando o método buscar()
        FuncFlor ffSaida = contFuFl.buscar(ffEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, ffSaida.toString());

        //Voltando para o menu
        menu();
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        //Criando e setando valores nas variaveis
        int idFunc = Integer.parseInt(JOptionPane.showInputDialog("id do Funcionario"));
        int idFlor = Integer.parseInt(JOptionPane.showInputDialog("id da Flor"));
        String dt_compra = JOptionPane.showInputDialog("Data da compra");
        String valor = JOptionPane.showInputDialog("Valor");
        String obs = JOptionPane.showInputDialog("Observação");

        //Instanciando a classe FuncFlor usando um construtor
        FuncFlor ffEntrada = new FuncFlor(idFunc, idFlor, dt_compra, valor, obs);

        //Instanciando a classe ControllerFuncFlor
        contFuFl = new ControllerFuncFlor();

        //Guardando o conteúdo que será retornado do ControllerFuncFlor usando o método inserir()
        FuncFlor ffSaida = contFuFl.inserir(ffEntrada);

        //Mostrando para o usuário o resultado da pesquisa
        JOptionPane.showMessageDialog(null, ffSaida.toString());

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
