//Pacote para organizar as classes
package model.bean;

public class Funcionario {
    
    //Variaveis que serão usadas na cosntrução de construtores e métodos
    private int id;
    private String nome;
    private String cateira;
    private String cargo;
    private String salario;

    //Construtor que guarda o id do funcionário
    public Funcionario(int id) {
        this.id = id;
    }

    //Construtor que guarda o nome do funcionário
    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    //Construtor que guarda o nome, a carteira de trabalho, o cargo e o salário
    public Funcionario(String nome, String cateira, String cargo, String salario) {
        this.nome = nome;
        this.cateira = cateira;
        this.cargo = cargo;
        this.salario = salario;
    }

    //Construtor que guarda o id, o nome, a carteira de trabalho, o cargo e o salário
    public Funcionario(int id, String nome, String cateira, String cargo, String salario) {
        this.id = id;
        this.nome = nome;
        this.cateira = cateira;
        this.cargo = cargo;
        this.salario = salario;
    }

    //Método que retorna o id do funcionário
    public int getId() {
        return id;
    }

    //Método que guarda o id do funcionário
    public void setId(int id) {
        this.id = id;
    }

    //Método que retorna o nome do funcionário
    public String getNome() {
        return nome;
    }

    //Método que guarda o nome do funcionário
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método que retorna a carteira de trabalho do funcionário
    public String getCateira() {
        return cateira;
    }

    //Método que guarda a carteira de trabalho do funcionário
    public void setCateira(String cateira) {
        this.cateira = cateira;
    }

    //Método que retorna o cargo do funcionário
    public String getCargo() {
        return cargo;
    }

    //Método que guarda o cargo do funcionário
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //Método que retorna o salário do funcionário
    public String getSalario() {
        return salario;
    }

    //Método que guarda o salário do funcionário
    public void setSalario(String salario) {
        this.salario = salario;
    }

    //Método que retorna a saida os valores guardados na variaveis privadas
    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", Nome=" + nome + ", Cateira de Trabalho=" + cateira + ", Cargo=" + cargo + ", Salário=" + salario + '}';
    }    
}
