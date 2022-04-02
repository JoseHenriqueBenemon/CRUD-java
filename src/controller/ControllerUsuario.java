//Pacote para organizar as classes
package controller;

//Importando as classes
import java.util.List;
import model.bean.Usuario;
import model.dao.DaoUsuario;
import java.sql.SQLException;

public class ControllerUsuario {
    
    //Definindo uma variavel do tipo DaoUsuario com um valor padrão nulo
    DaoUsuario daoUsu = null;
    
    //método exluir() para chamar o método excluir() no DaoUsuario
    public Usuario excluir(Usuario usu) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoUsuario
        daoUsu = new DaoUsuario();
        
        //Retornando os dados que serão pegos no método excluir() do DaoUsuario
        return daoUsu.excluir(usu);
    }

    //método alterar() para chamar o método alterar() no DaoUsuario
    public Usuario alterar(Usuario usu) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoUsuario
        daoUsu = new DaoUsuario();
        
        //Retornando os dados que serão pegos no método alterar() do DaoUsuario
        return daoUsu.alterar(usu);
    }

    //método listar() para chamar o método listar() no DaoUsuario
    public List<Usuario> listar(Usuario usu) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoUsuario
        daoUsu = new DaoUsuario();
        
        //Retornando os dados que serão pegos no método listar() do DaoUsuario
        return daoUsu.listar(usu);
    }

    //método buscar() para chamar o método buscar() no DaoUsuario
    public Usuario buscar(Usuario usu) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoUsuario
        daoUsu = new DaoUsuario();
        
        //Retornando os dados que serão pegos no método buscar() do DaoUsuario
        return daoUsu.buscar(usu);
    }

    //método inserir() para chamar o método inserir() no DaoUsuario
    public Usuario inserir(Usuario usu) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoUsuario
        daoUsu = new DaoUsuario();
        
        //Retornando os dados que serão pegos no método inserir() do DaoUsuario
        return daoUsu.inserir(usu);
    }

    //método validar() para chamar o método validar() no DaoUsuario
    public boolean validar(Usuario u) throws SQLException, ClassNotFoundException {
        //Criando uma variavel booleana para verificar se o usuário foi validado
        boolean validado= false;

        //Instanciando a classe DaoUsuario
        daoUsu = new DaoUsuario();
        
        //Guardando o conteúdo que será retornado do DaoUsuario usando o método validar()
        Usuario usuSaida = daoUsu.validar(u);

        //verificando se o retorno não é vazio
        if(usuSaida != null){
            //Verificando se as variaveis de entrada são iguais as variaveis de saida  
            if(u.getLogin().equals(usuSaida.getLogin()) && u.getSenha().equals(usuSaida.getSenha())) {
                //Mudando a variavel para mostrar que o usuário foi validado
                validado = true;
            }
        }

        //retornando a validação do usuário
        return validado;
    }
    
}
