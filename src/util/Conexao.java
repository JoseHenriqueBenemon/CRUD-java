//Pacote para organizar as classes
package util;

//Importando as classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        //Fazendo conexão com o banco de dados
        try {
            //Drive mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //variaveis da conexão com o banco de dados
            String url ="jdbc:mysql://localhost:3306/atv_pdm";
            String usuario = "";
            String senha = "";

            //retornando a conxeão com banco de dados, caso dê certo
            return DriverManager.getConnection(url,usuario,senha);
            
        } catch (SQLException e) { //E caso dê algum erro, ele mostrará aqui
            throw new RuntimeException(e);
        }
    }
}
