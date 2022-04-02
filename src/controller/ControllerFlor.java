//Pacote para organizar as classes
package controller;

//Importando as classes
import java.util.List;
import model.bean.Flor;
import model.dao.DaoFlor;
import java.sql.SQLException;

public class ControllerFlor {
    
    //Definindo uma variavel do tipo DaoFlor com um valor padrão nulo
    DaoFlor daoFlor = null;
    
    //método exluir() para chamar o método excluir() no DaoFlor
    public Flor excluir(Flor flor) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFlor
        daoFlor = new DaoFlor();

        //Retornando os dados que serão pegos no método excluir() do DaoFlor
        return daoFlor.excluir(flor);
    }

    //método alterar() para chamar o método alterar() no DaoFlor
    public Flor alterar(Flor flor) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFlor
        daoFlor = new DaoFlor();

        //Retornando os dados que serão pegos no método alterar() do DaoFlor
        return daoFlor.alterar(flor);
    }

    //método listar() para chamar o método listar() no DaoFlor
    public List<Flor> listar(Flor flor) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFlor
        daoFlor = new DaoFlor();

        //Retornando os dados que serão pegos no método listar() do DaoFlor
        return daoFlor.listar(flor);
    }

    //método buscar() para chamar o método buscar() no DaoFlor
    public Flor buscar(Flor flor) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFlor
        daoFlor = new DaoFlor();

        //Retornando os dados que serão pegos no método buscar() do DaoFlor
        return daoFlor.buscar(flor);
    }

    //método inserir() para chamar o método inserir() no DaoFlor
    public Flor inserir(Flor flor) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFlor
        daoFlor = new DaoFlor();

        //Retornando os dados que serão pegos no método buscar() do DaoFlor
        return daoFlor.inserir(flor);
    }
}
