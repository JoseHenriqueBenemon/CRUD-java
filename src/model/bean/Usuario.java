//Pacote para organizar as classes
package model.bean;

public class Usuario {

    //Variaveis que serão usadas na cosntrução de construtores e métodos
    private int id;
    private String login;
    private String senha;
    private String status;
    private String tipo;

    //Construtor que guarda o id do usário
    public Usuario(int id) {
        this.id = id;
    }

    //Construtor que guarda o login do usário
    public Usuario(String login) {
        this.login = login;
    }

    //Construtor que guarda o login e a senha do usário
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    //Construtor que guarda o login, a senha, os status e o tipo do usário
    public Usuario(String login, String senha, String status, String tipo) {
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
    }

    //Construtor que guarda o id, o login, a senha, os status e o tipo do usário
    public Usuario(int id, String login, String senha, String status, String tipo) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
    }

    //Método que retorna o id do usuário
    public int getId() {
        return id;
    }

    //Método que guarda o id do usuário
    public void setId(int id) {
        this.id = id;
    }

    //Método que retorna o login do usuário
    public String getLogin() {
        return login;
    }

    //Método que guarda o login do usuário
    public void setLogin(String login) {
        this.login = login;
    }

    //Método que retorna a senha do usuário
    public String getSenha() {
        return senha;
    }

    //Método que guarda a senha do usuário
    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Método que retorna os status do usuário
    public String getStatus() {
        return status;
    }

    //Método que guarda os status do usuário
    public void setStatus(String status) {
        this.status = status;
    }

    //Método que retorna o tipo do usuário
    public String getTipo() {
        return tipo;
    }

    //Método que guarda o tipo do usuário
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", login=" + login + ", senha=" + senha + ", status=" + status + ", tipo=" + tipo + '}';
    }
}
