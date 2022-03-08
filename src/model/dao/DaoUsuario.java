package model.dao;

//import's
import model.bean.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class DaoUsuario {
    
    //Criando a classe para excluir um usuario
    public Usuario excluir(Usuario u) {
        return u;
    }

    //Criando a classe alterar
    public Usuario alterar(Usuario u) {
        return u;

    }

    //Criando a classe para listar um usuario
    public List<Usuario> listar(Usuario u) {
        List<Usuario> usus = new ArrayList<>();
        return usus;
        
    }

    //Criando a classe para buscar um usuario
    public Usuario buscar(Usuario u) {
        return u;
        
    }

    //Criando a classe para inserir um usuario
    public Usuario inserir(Usuario u) {
        return u; 
    }

    //Crinado a classe para valida um usuario
    public Usuario valida(Usuario u) {
        
        //verificando se o login do usuario está correto
        if(u.getLogin().equals("XXX")) { // Caso sim, seta valores
            u.setId(1000);
            u.setStatus("ATIVO");
            u.setTipo("ADM");
        } else { //Caso não, seta outros valores
            u.setId(000);
            u.setStatus("INATIVO");
            u.setTipo("NÃO");
        }
        return u; 
    }

    
}
