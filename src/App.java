import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.*;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Verificando se o método retorna um valor verdadeiro
        if(ManterUsuario.valida()) {
            menu();
        } else {
            System.out.println("USUARIO INVALIDO");
        }
    }

    public static void menu() throws SQLException, ClassNotFoundException {
        //menu para determinar qual classe deve ser chamada
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("0 - Sair \n 1 - Usuario \n 2 - Funcionário \n 3 - Flores \n 4 - Venda de flor"));
        switch (operacao) {
            case 0:
                int sair = JOptionPane.showConfirmDialog(null,"Deseja Sair");
                if(sair > 0) menu();
                System.out.println("Valor de Sair = " + sair);
                break;
            case 1:
                ManterUsuario.menu();
                break;
            case 2:
                ManterFuncionario.menu();
                break;
            case 3:
                ManterFlor.menu();
                break;
            case 4:
                ManterFuncFlor.menu();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Erro opcao invalida");
                menu();
                break;
        }
    }
}
