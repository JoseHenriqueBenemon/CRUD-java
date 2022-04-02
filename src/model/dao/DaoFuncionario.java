//Pacote para organizar as classes
package model.dao;

//Importando as classes
import model.bean.Funcionario;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoFuncionario {
    
    //Instanciando uma variavel de conexão
    private final Connection c;
    
    //Construtor de conexão
    public DaoFuncionario() throws SQLException, ClassNotFoundException{
        this.c = new Conexao().getConnection();
    }

    public Funcionario buscar(Funcionario Func) throws SQLException{
        //query sql para ser executada
        String sql = "select * from assalariados WHERE id = ?";

        //prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);

        //seta os valores
        stmt.setInt(1,Func.getId());

        //executa
        ResultSet rs = stmt.executeQuery();

        //cria e instancia uma variavel do tipo Funcionario
        Funcionario retorno = null;

        //verificando se existe resultado na query
        while (rs.next()) {      
            // criando o objeto Funcionario
            retorno = new Funcionario(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5));
        }

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return retorno;
   }
    
    public Funcionario alterar(Funcionario Func) throws SQLException{
        //query sql para ser executada
        String sql = "UPDATE assalariados SET nome = ?, carteira_de_trabalho = ?, cargo = ?, salario = ? WHERE id = ?";
        
        //prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);

        //seta os valores
        stmt.setString(1,Func.getNome());
        stmt.setString(2,Func.getCateira());
        stmt.setString(3,Func.getCargo());
        stmt.setString(4,Func.getSalario());
        stmt.setInt(5,Func.getId());

        //executa
        stmt.execute();

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return Func;
    }

    public Funcionario excluir(Funcionario Func) throws SQLException{
        //query sql para ser executada
        String sql = "DELETE FROM assalariados WHERE id = ?";

        //prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);

        //seta o valor
        stmt.setInt(1,Func.getId());

        //executa
        stmt.execute();

        //Finalizando o prepared statement
        stmt.close();

        //Finalizando a conexão com o banco
        c.close();

        //retornando os resultados da pesquisa
        return Func;
    }

    public List<Funcionario> listar(Funcionario FuncEnt) throws SQLException{
        //funcs: array armazena a lista de registros
        List<Funcionario> funcs = new ArrayList<>();
        
        //query sql para ser executada
        String sql = "SELECT * FROM assalariados WHERE nome LIKE ?";

        //prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);

        //seta o valor
        stmt.setString(1,"%" + FuncEnt.getNome() + "%");
        
        //executa
        ResultSet rs = stmt.executeQuery();
        
        //verificando se existe resultado na query
        while (rs.next()) {      
            // criando o objeto Usuario
            Funcionario func = new Funcionario(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5)
            );

            // adiciona o func à lista de funcs
            funcs.add(func);
        }
        
        //Finalizando a execução da querry
        rs.close();

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return funcs;
    }
    
    public Funcionario inserir(Funcionario Func) throws SQLException{
        //query sql para ser executada
        String sql = "INSERT INTO assalariados" + " (nome, carteira_de_trabalho, cargo, salario)" + " values (?,?,?,?)";
    
        //prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        //seta os valores
        stmt.setString(1,Func.getNome());
        stmt.setString(2,Func.getCateira());
        stmt.setString(3,Func.getCargo());
        stmt.setString(4,Func.getSalario());

        //executa
        stmt.executeUpdate();

        //Pega uma chave gerada pela classe ResultSet
        ResultSet rs = stmt.getGeneratedKeys();

        //verificando se existe resultado na query
        if (rs.next()) {
            //Define o chave gerada como uma variavel
            int id = rs.getInt(1);

            //seta a chave como o id do funcionário
            Func.setId(id);
        }

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return Func;
    }    
}