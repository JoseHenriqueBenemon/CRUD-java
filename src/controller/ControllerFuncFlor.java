//Pacote para organizar as classes
package controller;

//Importando as classes
import java.util.ArrayList;
import java.util.List;
import model.bean.*;
import model.dao.DaoFuncFlor;
import java.sql.SQLException;

public class ControllerFuncFlor {
    
    //Definindo uma variavel do tipo DaoFuncFlor com um valor padrão nulo
    DaoFuncFlor daoFuncFlor = null;
    
    //método exluir() para chamar o método excluir() no DaoFuncFlor
    public FuncFlor excluir(FuncFlor ff) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFlor
        daoFuncFlor = new DaoFuncFlor();

        //Retornando os dados que serão pegos no método excluir() do DaoFuncFlor
        return daoFuncFlor.excluir(ff);
    }

    //método alterar() para chamar o método alterar() no DaoFuncFlor
    public FuncFlor alterar(FuncFlor ff) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFlor
        daoFuncFlor = new DaoFuncFlor();

        //Retornando os dados que serão pegos no método alterar() do DaoFuncFlor
        return daoFuncFlor.alterar(ff);
    }

    //método listar() para chamar o método listar() no DaoFuncFlor
    public List<FuncFlor> listar(FuncFlor ff) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFlor
        daoFuncFlor = new DaoFuncFlor();

        //Criando uma lista passando os valores que o usuário mandou
        List<FuncFlor> listaff = daoFuncFlor.listar(ff);

        //Criando uma lista auxiliar
        List<FuncFlor> listaffAux = new ArrayList<>();

        //Laço de repetição para verificar os dados dentro da lista pega no DaoFuncFlor
        for (FuncFlor fufl : listaff) {
            //Guardando os dados separadamente na lista auxiliar
            listaffAux.add(buscar(fufl));
        }

        //Retornando os dados que foram separados com os resultados do listar() no DaoFuncFlor
        return listaffAux;
    }

    //método buscar() para chamar o método buscar() no DaoFuncFlor
    public FuncFlor buscar(FuncFlor ff) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFlor
        daoFuncFlor = new DaoFuncFlor();
        
        //Guardando os dados retornados do buscar() no DaoFuncFlor
        FuncFlor fufl = daoFuncFlor.buscar(ff);

        //Instanciando a classe ControllerFuncionario
        ControllerFuncionario contFu = new ControllerFuncionario();

        //Guardando o conteúdo que será retornado do ControllerFuncionario usando o método buscar() passando o id da funcionário como parâmetro
        Funcionario funcEntrada = new Funcionario(fufl.getIdFunc());
        fufl.setFunc(contFu.buscar(funcEntrada));
        
        //Instanciando a classe ControllerFlor
        ControllerFlor contFl = new ControllerFlor();

        //Guardando o conteúdo que será retornado do ControllerFlor usando o método buscar() passando o id da flor como parâmetro
        Flor flEntrada = new Flor(fufl.getIdFlor());
        fufl.setFlor(contFl.buscar(flEntrada));
        
        //retornando os objetos retornados pelos diferentes instâncias
        return fufl;
    }

    //método inserir() para chamar o método inserir() no DaoFuncFlor
    public FuncFlor inserir(FuncFlor ff) throws SQLException, ClassNotFoundException {
        //Instanciando a classe DaoFlor
        daoFuncFlor = new DaoFuncFlor();

        //Retornando os dados que serão pegos no método alterar() do DaoFuncFlor
        return daoFuncFlor.inserir(ff);
    }
}
