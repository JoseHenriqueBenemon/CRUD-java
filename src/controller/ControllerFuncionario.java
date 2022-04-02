//Pacote para organizar as classes
package controller;

//Importando as classes
import java.util.List;
import model.bean.Funcionario;
import model.dao.DaoFuncionario;
import java.sql.SQLException;

public class ControllerFuncionario {
    
    //Definindo uma variavel do tipo DaoFuncionario com um valor padrão nulo
    DaoFuncionario daoFunc = null;
    
    //método exluir() para chamar o método excluir() no DaoFuncionario
    public Funcionario excluir(Funcionario Func) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFuncionario
        daoFunc = new DaoFuncionario();
        
        //Retornando os dados que serão pegos no método excluir() do DaoFuncionario
        return daoFunc.excluir(Func);
    }

    //método alterar() para chamar o método alterar() no DaoFuncionario
    public Funcionario alterar(Funcionario Func) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFuncionario
        daoFunc = new DaoFuncionario();
        
        //Retornando os dados que serão pegos no método alterar() do DaoFuncionario
        return daoFunc.alterar(Func);
    }

    //método listar() para chamar o método listar() no DaoFuncionario
    public List<Funcionario> listar(Funcionario Func) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFuncionario
        daoFunc = new DaoFuncionario();
        
        //Retornando os dados que serão pegos no método listar() do DaoFuncionario
        return daoFunc.listar(Func);
    }

    //método buscar() para chamar o método buscar() no DaoFuncionario
    public Funcionario buscar(Funcionario Func) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFuncionario
        daoFunc = new DaoFuncionario();
        
        //Retornando os dados que serão pegos no método buscar() do DaoFuncionario
        return daoFunc.buscar(Func);
    }

    //método inserir() para chamar o método inserir() no DaoFuncionario
    public Funcionario inserir(Funcionario Func) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFuncionario
        daoFunc = new DaoFuncionario();
        
        //Retornando os dados que serão pegos no método inserir() do DaoFuncionario
        return daoFunc.inserir(Func);
    }
}



