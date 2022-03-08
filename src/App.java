//import's
import view.ManterUsuario;

/**
 *
 * @author ProfAlexandre
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // verifica se o usuario inserido é valido
        if(ManterUsuario.valida()) { // Caso seja valido
            ManterUsuario.inserir();
        } else { // Caso ele não seja valido
            System.out.println("USUARIO INVALIDO");
        }
        
    }
    
}
