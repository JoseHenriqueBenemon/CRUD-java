/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import's
import java.util.List;
import model.bean.Usuario;
import model.dao.DaoUsuario;

/**
 *
 * @author ProfAlexandre
 */
public class ControllerUsuario {
    
    //Pegando uma classe do arquivo DaoUsuario 
    DaoUsuario daoUsu;
    
    //Criando um objeto que pede para excluir o usuario
    public Usuario excluir(Usuario u) {
        return daoUsu.excluir(u);
    }
    
    //Criando um objeto que pede para altera o usuario
    public Usuario alterar(Usuario u) {
        return daoUsu.alterar(u);
    }

    //Criando um objeto que pede para lista o(s) usuario(s)
    public List<Usuario> listar(Usuario u) {
        return daoUsu.listar(u);
    }

    //Criando um objeto que pede para busca o usuario
    public Usuario buscar(Usuario u) {
        return daoUsu.buscar(u);
    }

    //Criando um objeto que pede para insere o usuario
    public Usuario inserir(Usuario u) {
        daoUsu = new DaoUsuario();
        return daoUsu.inserir(u);
    }

    //Criando um objeto que pede para valida o usuario
    public Usuario valida(Usuario u) {
        daoUsu = new DaoUsuario();
        return daoUsu.valida(u);
    }
    
}
