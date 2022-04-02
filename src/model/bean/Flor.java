//Pacote para organizar as classes
package model.bean;

public class Flor {
    
    //Variaveis que serão usadas na cosntrução de construtores e Métodos
    private int id;
    private String nome;
    private String genero;
    private String familia;
    private String ordem;
    private String classe;

    //Construtor que guarda o id da flor
    public Flor(int id) {
        this.id = id;
    }

    //Construtor que guarda o nome da flor
    public Flor(String nome) {
        this.nome = nome;
    }

    //Construtor que guarda o id e o nome
    public Flor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //Construtor que guarda o nome, o gênero, a familia, a ordem e a classe
    public Flor(String nome, String genero, String familia, String ordem, String classe) {
        this.nome = nome;
        this.genero = genero;
        this.familia = familia;
        this.ordem = ordem;
        this.classe = classe;
    }

    //Construtor que guarda o id, o nome, o gênero, a familia, a ordem e a classe
    public Flor(int id, String nome, String genero, String familia, String ordem, String classe) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.familia = familia;
        this.ordem = ordem;
        this.classe = classe;
    }

    //Método que retorna o id da flor
    public int getId() {
        return id;
    }

    //Método que guarda o id da flor
    public void setId(int id) {
        this.id = id;
    }

    //Método que retorna o nome da flor
    public String getNome() {
        return nome;
    }

    //Método que retorna o nome da flor
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método que retorna o genêro da flor
    public String getGenero() {
        return genero;
    }
    
    //Método que guarda o id da flor
    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Método que retorna a familia da flor
    public String getFamilia() {
        return familia;
    }

    //Método que guarda o id da flor
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    //Método que retorna a ordem da flor
    public String getOrdem() {
        return ordem;
    }

    //Método que guarda a ordem da flor
    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    //Método que retorna a classe da flor
    public String getClasse() {
        return classe;
    }

    //Método que guarda a classe da flor
    public void setClasse(String classe) {
        this.classe = classe;
    }

    //Método que retorna a saida os valores guardados na variaveis privadas
    @Override
    public String toString() {
        return "Flores{" + "Id=" + id + ", Nome=" + nome + ", Genêro=" + genero + ", Familia=" + familia + ", Ordem=" + ordem + ", Classe=" + classe + '}';
    }
}

