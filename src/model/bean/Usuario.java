package model.bean;

/**
 *
 * @author ProfAlexandre
 */
public class Usuario {
    
    //Criando variaveis globais
    private int id;
    private String login;
    private String senha;
    private String status;
    private String tipo;

    //Criando um objeto que seta o id  
    public Usuario(int id) {
        this.id = id;
    }

    //Criando um objeto que seta o login  
    public Usuario(String login) {
        this.login = login;
    }

    //Criando um objeto que seta o login e senha  
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    //Criando um objeto que seta o login, senha, status e tipo   
    public Usuario(String login, String senha, String status, String tipo) {
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
    }
    
    //Criando um objeto que seta o id, o login, a senha, o status e o tipo  
    public Usuario(int id, String login, String senha, String status, String tipo) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
    }

    //Criando um objeto que retorna o id  
    public int getId() {
        return id;
    }

    //Criando um objeto que seta o id  
    public void setId(int id) {
        this.id = id;
    }
    
    //Criando um objeto que retorna o login  
    public String getLogin() {
        return login;
    }

    //Criando um objeto que seta o login  
    public void setLogin(String login) {
        this.login = login;
    }

    //Criando um objeto que retorna a senha 
    public String getSenha() {
        return senha;
    }

    //Criando um objeto que seta a senha
    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Criando um objeto que retorna o status  
    public String getStatus() {
        return status;
    }

    //Criando um objeto que seta o status  
    public void setStatus(String status) {
        this.status = status;
    }

    //Criando um objeto que retorna o tipo  
    public String getTipo() {
        return tipo;
    }

    //Criando um objeto que seta o tipo  
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Criando um objeto que retorna os dados globais setados 
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", login=" + login + ", senha=" + senha + ", status=" + status + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
