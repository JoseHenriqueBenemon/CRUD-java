//Pacote para organizar as classes
package model.dao;

//Importando as classes
import model.bean.FuncFlor;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoFuncFlor {
    
    //Instanciando uma variavel de conexão
    private final Connection c;
    
    //Construtor de conexão
    public DaoFuncFlor() throws SQLException, ClassNotFoundException{
        this.c = new Conexao().getConnection();
    }

    public FuncFlor buscar(FuncFlor ff) throws SQLException{
        //query sql para ser executada
        String sql = "SELECT * FROM assal_flor WHERE id = ?";

        //prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);

        //seta o valor
        stmt.setInt(1,ff.getId());

        //executa
        ResultSet rs = stmt.executeQuery();

        //cria e instancia uma variavel do tipo FuncFlor
        FuncFlor retorno = null;

        //verificando se existe resultado na query
        while (rs.next()) {      
            // criando o objeto FuncFlor
            retorno = new FuncFlor(
                rs.getInt(1),
                rs.getInt(2),
                rs.getInt(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6)
            );
        }

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return retorno;
   }    
    
    public FuncFlor alterar(FuncFlor ff) throws SQLException{
        //query sql para ser executada
        String sql = "UPDATE assal_flor SET idAssal = ?, idFlor = ?, data_compra = ?, valor = ?, observacao = ? WHERE id = ?";

        //prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);

        //seta os valores
        stmt.setInt(1,ff.getIdFunc());
        stmt.setInt(2,ff.getIdFlor());
        stmt.setString(3,ff.getDt_compra());
        stmt.setString(4,ff.getValor());
        stmt.setString(5,ff.getObs());
        stmt.setInt(6,ff.getId());

        //executa
        stmt.execute();

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return ff;
    }

    public FuncFlor excluir(FuncFlor ff) throws SQLException{
        //query sql para ser executada
        String sql = "DELETE FROM assal_flor WHERE id = ?";

        //prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);

        //seta os valores
        stmt.setInt(1,ff.getId());

        //executa
        stmt.execute();

        //Finalizando o prepared statement
        stmt.close();

        //Finalizando a conexão com o banco de dados
        c.close();

        //retornando os resultados da pesquisa
        return ff;
    }

    public List<FuncFlor> listar(FuncFlor ffEnt) throws SQLException{
        //ffs: array armazena a lista de registros
        List<FuncFlor> ffs = new ArrayList<>();

        //query sql para ser executada
        String sql = "SELECT * FROM assal_flor WHERE data_compra like ?";

        //prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);

        //seta os valores
        stmt.setString(1,"%" + ffEnt.getDt_compra() + "%");
        
        //executa
        ResultSet rs = stmt.executeQuery();
        
        //verificando se existe resultado na query
        while (rs.next()) {      
            // criando o objeto FuncFlor
            FuncFlor ff = new FuncFlor(
                rs.getInt(1),
                rs.getInt(2),
                rs.getInt(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6)
            );
            // adiciona o ff à lista de ffs
            ffs.add(ff);
        }
        
        //Finalizando a execução da querry
        rs.close();

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return ffs;
    }
    
    public FuncFlor inserir(FuncFlor ff) throws SQLException{
        //query sql para ser executada
        String sql = "INSERT INTO assal_flor" + " (idAssal, idFlor, data_compra, valor, observacao)" + " values (?,?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setInt(1,ff.getIdFunc());
        stmt.setInt(2,ff.getIdFlor());
        stmt.setString(3,ff.getDt_compra());
        stmt.setString(4,ff.getValor());
        stmt.setString(5,ff.getObs());

        // executa
        stmt.executeUpdate();

        //Pega uma chave gerada pela classe ResultSet
        ResultSet rs = stmt.getGeneratedKeys();

        //verificando se existe resultado na query
        if (rs.next()) {
            //Define o chave gerada como uma variavel
            int id = rs.getInt(1);

            //seta a chave como o id da venda da flor
            ff.setId(id);
        }

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return ff;
    }
}