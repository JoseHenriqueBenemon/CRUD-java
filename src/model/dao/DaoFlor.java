//Pacote para organizar as classes
package model.dao;

//Importando as classes
import model.bean.Flor;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoFlor {
    
    //Instanciando uma variavel de conexão
    private final Connection c;
    
    //Construtor de conexão
    public DaoFlor() throws SQLException, ClassNotFoundException{
        this.c = new Conexao().getConnection();
    }

    public Flor buscar(Flor flor) throws SQLException{
        //query sql para ser executada
        String sql = "SELECT * FROM flores WHERE id = ?";

        //prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);

        //seta o valor
        stmt.setInt(1,flor.getId());

        //executa
        ResultSet rs = stmt.executeQuery();

        //cria e instancia uma variavel do tipo Flor
        Flor retorno = null;

        //verificando se existe resultado na query
        while (rs.next()) {      
            // criando o objeto Flor
            retorno = new Flor(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
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
    
    public Flor alterar(Flor flor) throws SQLException{
        //query sql para ser executada
        String sql = "UPDATE flores SET nome = ?, genero = ?, familia = ?, ordem = ?, classe = ? WHERE id = ?";
        
        //prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        
        //seta os valores
        stmt.setString(1,flor.getNome());
        stmt.setString(2,flor.getGenero());
        stmt.setString(3,flor.getFamilia());
        stmt.setString(4,flor.getOrdem());
        stmt.setString(5,flor.getClasse());
        stmt.setInt(6,flor.getId());

        //executa
        stmt.execute();

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return flor;
    }

    public Flor excluir(Flor flor) throws SQLException{
        //query sql para ser executada
        String sql = "DELETE FROM flores WHERE id = ?";

        //prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);

        //seta o valor
        stmt.setInt(1,flor.getId());

        //executa
        stmt.execute();
        
        //Finalizando o prepared statement
        stmt.close();

        //Finalizando o conexão com banco de dados
        c.close();

        //retornando os resultados da pesquisa
        return flor;
    }

    public List<Flor> listar(Flor florEnt) throws SQLException{
        //flores: array armazena a lista de registros
        List<Flor> flores = new ArrayList<>();
        
        //query sql para ser executada
        String sql = "SELECT * FROM flores WHERE nome LIKE ?";

        //prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);

        //seta o valor
        stmt.setString(1,"%" + florEnt.getNome() + "%");
        
        //executa
        ResultSet rs = stmt.executeQuery();
        
        //verificando se existe resultado na query
        while (rs.next()) {      
            //criando o objeto Flor
            Flor flor = new Flor(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6)
            );
            // adiciona o flor à lista de flores
            flores.add(flor);
        }
        
        //Finalizando a execução da querry
        rs.close();

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return flores;
    }
    
    public Flor inserir(Flor flor) throws SQLException{
        //query sql para ser executada
        String sql = "INSERT INTO flores" + " (nome, genero, familia, ordem, classe)" + " values (?,?,?,?,?)";

        //prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        //seta os valores
        stmt.setString(1,flor.getNome());
        stmt.setString(2,flor.getGenero());
        stmt.setString(3,flor.getFamilia());
        stmt.setString(4,flor.getOrdem());
        stmt.setString(5,flor.getClasse());

        // executa
        stmt.executeUpdate();

        //Pega uma chave gerada pela classe ResultSet
        ResultSet rs = stmt.getGeneratedKeys();

        //verificando se existe resultado na query
        if (rs.next()) {
            //Define o chave gerada como uma variavel
            int id = rs.getInt(1);

            //seta a chave como o id da Flor
            flor.setId(id);
        }

        //Finalizando o prepared statement
        stmt.close();

        //retornando os resultados da pesquisa
        return flor;
    }

    
}

